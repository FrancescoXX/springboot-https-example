Spring Boot Application with Https

Use keytool to generate key
--
>keytool -genkey -alias https-example -storetype JKS -keyalg RSA -keysize 2048 -validity 365 -keystore https-example.jks
