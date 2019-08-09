FROM node:10.16.2-alpine as node
WORKDIR /usr/src/app
COPY package*.json ./
RUN npm install
COPY . .
RUN npm run build

# Stage 2
FROM nginx:latest
COPY --from=node /usr/src/app/dist /usr/share/nginx/html
COPY ./nginx/conf/nginx.conf /etc/nginx/nginx.conf