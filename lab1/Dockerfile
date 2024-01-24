FROM ubuntu:xenial

RUN apt-get update && apt-get install -y \
    nodejs \
    npm

WORKDIR /app

COPY . /app

RUN npm install

CMD ["npm", "start"]
