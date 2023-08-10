### build stage ###
FROM gradle:7.6-jdk17 AS builder
RUN mkdir /usr/src/app
COPY --chown=gradle:gradle . /usr/src/app
WORKDIR /usr/src/app
RUN gradle build --no-daemon -x test

### Gradle 버전 선택
### JDK 버전 선택
### jar 저장할 폴더 생성
### gradle 파일 그 폴더로 이동 (빌드 준비 완료)
### 작업할 디렉토리 설정
### gradle build 명령어 실행
### => 배포할 jar 파일 생성 완료

FROM openjdk:17-alpine
ARG JAR_FILE=/usr/src/app/build/libs/*.jar
ENV JAVA_OPTS=""
COPY --from=builder ${JAR_FILE} app.jar
ENTRYPOINT java ${JAVA_OPTS} -jar /app.jar

### openjdk 버전 선택
### 빌드된 배포용 jar 파일의 위치 변수 추가
### Java 명령어 실행 옵션 ENV로 등록
### builder에서 생성된 jar 파일을 복사해서 app.jar로 이름 변경
### java 명령어로 생성된 jar 파일 실행