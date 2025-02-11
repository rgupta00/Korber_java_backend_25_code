# To containerize this app, follow these steps

### Make sure you are in node-js-app folder on your system

```
docker build -t rgupta00/node-app-image .
```
```
docker container run --name=first-node-cont -d -p 8550:8080 rgupta00/node-app-image
```
## That's it!!! now click on following 

http://localhost:8550

