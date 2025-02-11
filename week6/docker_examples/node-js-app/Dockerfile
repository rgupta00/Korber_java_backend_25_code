FROM alpine
LABEL maintainer="rgupta.mtech@gmail.com"
RUN apk add --update nodejs nodejs-npm
COPY . /src
WORKDIR /src
RUN npm install
ENV CREATEDBY="Rajeev Gupta"
EXPOSE 8080
ENTRYPOINT ["node", "./app.js"]
