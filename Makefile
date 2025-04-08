.PHONY: clean-java
clean-java:
	./gradlew :java-service:clean -x test

.PHONY: build-java
build-java: clean-java
	./gradlew :java-service::build -x test

.PHONY: test-java
test-java:
	./gradlew :java-service::test


.PHONY: run-java
run-java:
	./gradlew :java-service::run

## SpringBoot
.PHONY: clean-spring
clean-spring:
	 ./gradlew :springboot-app:clean -x test

.PHONY: build-spring
build-spring: clean-spring
	./gradlew :springboot-app:build -x test

.PHONY: test-spring
test-spring:
	./gradlew :springboot-app:test


.PHONY: run-spring
run-spring:
	./gradlew :springboot-app:bootRun