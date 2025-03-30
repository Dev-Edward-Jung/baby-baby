# 🎃 Baby-Baby  
A Spring JPA Project

---

## 👓 Project Background  
- To provide emotional rest and creative play opportunities for children tired of rigid and standardized education  
- To offer equal opportunities to children with disabilities, free from discrimination  

---

## 🎉 Objectives and Expected Outcomes  
- Give working parents more time for rest and leisure  
- Raise public awareness about the importance of inclusion and the social gap between children with and without disabilities  

---

## 🛠 Tools & Technologies  
- **Language & Frameworks**: Java, Spring Boot, Spring Data JPA, QueryDSL, Thymeleaf  
- **Frontend**: HTML, CSS, JavaScript, jQuery  
- **Database**: Oracle, DBeaver  
- **Security & API**: Spring Security, REST API, Naver OAuth, Kakao OAuth, Kakao Map API, BootPay API  
- **Testing & Dev Tools**: JUnit5, Postman, YAML, JSON, Lombok  
- **Version Control & IDE**: Git, GitHub, Sourcetree, IntelliJ IDEA  
- **Java Version**: JDK 11.0.15  

---

## 💪 My Roles in the Project  
- Planned service structure and led UI/UX design  
- **Frontend**:  
  - My Page  
  - Announcements  
- **Backend**:  
  - “Where Are Our Kids Now?” (지금 우리 아이들은)  
  - “Let’s Go Out” (놀러가요) main event features  
  - Member detail page  
  - Payment system  
- Designed and built database schema  
- Full CRUD for “Where Are Our Kids Now” and “Let’s Go Out” (including file uploads)  
- Implemented infinite scroll and banner images  
- Developed search functionality for event list page  
- Built detailed event view  
- Integrated BootPay API for payments  

---

## 🎈 ERD  
![ERD](https://github.com/dev-Adward/baby-baby/assets/122762326/8ef166aa-117a-4879-aa98-a22a1ad38f07)

---

## 📅 Project Progress  

**Frontend Progress**  
![Frontend](https://github.com/dev-Adward/baby-baby/assets/122762326/f5f210a4-60ba-4e35-b5cd-7cf9a07c71ea)

**Backend Progress**  
![Backend](https://github.com/dev-Adward/baby-baby/assets/122762326/46e8c673-c48f-43f4-bfe9-4d07b4608238)

---

## ✨ What I Learned

### 🧩 Challenges  
With over 30 tables, using QueryDSL to join multiple entities became highly complex.  
Unlike MyBatis, I ran into issues where joins didn’t behave as expected. It was confusing and I didn’t know how to navigate the entity relationships at first.

### 🔧 Solutions  
I asked my instructor questions and did a lot of research.  
Over time, I gained a deeper understanding of how JPA and QueryDSL work.  
One key lesson was that placing entity objects directly in the `from` clause could cause joins to fail.  
Fixing this helped me move forward.

### 🌟 Final Thoughts  
Although it was extremely difficult at first, I found myself falling in love with JPA and QueryDSL.  
Features like graph traversal and using objects to fetch related entities were fascinating—things that weren’t as intuitive or powerful in MyBatis.

---
