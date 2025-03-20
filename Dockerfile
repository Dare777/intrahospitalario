# Desde la ruta /mnt/c/arquetipos/intrahospitalario --> Lanzar comando: docker build -t intrahospitalario .
FROM icr.io/appcafe/open-liberty:full-java21-openj9-ubi-minimal

COPY intrahospitalario-boot/src/main/liberty/config/ /config/

COPY intrahospitalario-boot/target/intrahospitalario.war /config/apps

RUN configure.sh