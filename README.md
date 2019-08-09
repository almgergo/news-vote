# A fullstack excercise where you can vote on the latest news about Bitcoin

## Short description

### Frontend 
Written in angular the frontend using a public API retrieves the latest news on Bitcoin.  
The user can then vote on the given article and see the result of the previous votes.  

### Backend
Stores and retrieves the votes from a H2 in memory database  
The database is persisted in the users home directory under: "~/data/demo".  

# Deployment
## Development
This will require you to have the environment set up (Java 8+, Node 10.16+)

### Backend
- navigate to backend/ directory and run 
```
gradlew.bat bootRun
```

### Frontend
navigate to frontend/ directory and run 
```
npm start
```

## Docker
if you have docker installed, run
```
docker-compose up -d
```
from the root directory