# Resume Generator

## Overview
The **Resume Generator** is a full-stack web application that allows users to create professional resumes effortlessly. The project integrates AI-powered content generation to assist users in crafting well-structured and optimized resumes.

## Tech Stack
- **Backend:** Spring Boot (Java)
- **Frontend:** React.js
- **AI Model:** DeepSeek-R1 (Locally hosted)

## Features
- User-friendly interface for inputting resume details
- AI-powered content suggestions
- Multiple resume templates
- Download resume in PDF format
- Secure authentication

## Installation & Setup
### Prerequisites
- Java 17+
- Node.js & npm
- Spring Boot
- React.js

### Backend Setup
```sh
cd backend
mvn clean install
mvn spring-boot:run
```

### Frontend Setup
```sh
cd frontend
npm install
npm start
```

### AI Integration
- If using **DeepSeek-R1**, ensure the model is downloaded and properly configured.

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/resumes` | Fetch all resumes |
| POST | `/api/resumes` | Create a new resume |
| PUT | `/api/resumes/{id}` | Update an existing resume |
| DELETE | `/api/resumes/{id}` | Delete a resume |


## Future Enhancements
- Advanced AI-based resume scoring
- More templates and customization options
- Cloud storage integration

## Contributing
Contributions are welcome! Feel free to fork this repository and submit a pull request.

## License
MIT License

---
### Author
**Himanshu Rawat**  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](http://www.linkedin.com/in/himanshu-rawat20)  
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/himanshur1234)  
[![Portfolio](https://img.shields.io/badge/Portfolio-FF5722?style=for-the-badge&logo=web&logoColor=white)](https://portfolio-ten-sigma-22.vercel.app/)



