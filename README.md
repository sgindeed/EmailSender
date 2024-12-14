# ✉️ EmailSender 📤  

[![View on GitHub](https://img.shields.io/badge/View%20on-GitHub-blue?logo=github)](https://github.com/sgindeed/EmailSender)

## 🔎 Overview  
**EmailSender** is a Spring Boot application 🌟 designed to send emails with attachments seamlessly. Perfect for automating email workflows and enhancing communication processes! 🚀  

---

## 🚀 Features  
- 📧 **Send Emails**: Easily send emails to specified recipients.  
- 📎 **Attachment Support**: Attach files like PDFs, images, or documents.  
- 🔒 **Secure Configuration**: Utilizes industry-standard SMTP for safe and reliable email delivery.  
- ⚙️ **Spring Boot Powered**: Built with Spring Boot for scalability and simplicity.  

---

## 📂 Project Structure  
```
EmailSender/
├── src/main/java/com/supCode/SpringEmail/
│   ├── EmailSenderService.java         # Core logic for sending emails with attachments
│   └── SpringEmailApplication.java     # Main application class
└── src/main/resources/
    └── application.properties          # Email SMTP configuration
```  

---

## 🛠️ Getting Started  

### Prerequisites  
- Java 17 or later ☕  
- Maven or Gradle build tool ⚒️  
- SMTP Server credentials (e.g., Gmail, Outlook)  

---

### Installation  

1. **Clone the Repository** 📥:  
   ```bash  
   git clone https://github.com/sgindeed/EmailSender.git  
   cd EmailSender  
   ```  

2. **Configure SMTP Details** 🔑:  
   Open `src/main/resources/application.properties` and configure your email settings:  
   ```properties  
   spring.mail.host=smtp.gmail.com  
   spring.mail.port=587  
   spring.mail.username=your_email@gmail.com  
   spring.mail.password=your_password  
   spring.mail.properties.mail.smtp.auth=true  
   spring.mail.properties.mail.smtp.starttls.enable=true  
   ```  

3. **Run the Application** 🚀:  
   Use Maven or your preferred IDE to run the application:  
   ```bash  
   mvn spring-boot:run  
   ```  

---

## 📨 How to Use  

1. **Start the Application**:  
   Run the application locally to initiate email services.  

2. **Trigger Email Sending**:  
   Upon startup, the application sends an email to the configured recipient with the provided attachment.  

   Modify the following details in `SpringEmailApplication.java` to suit your needs:  
   ```java  
   emailSenderService.sendMailWithAttachment(
       "RECIEVER_MAIL",             // Replace with recipient's email  
       "This is email body.",       // Email body  
       "This email subject",        // Email subject  
       "files/Supratim_demo_cv.pdf" // Path to attachment  
   );  
   ```  

---

## 🌐 Example Output  

- Console Output:  
   ```plaintext  
   Mail with attachment sent successfully..  
   ```  
- Email:  
   - **Subject**: This email subject  
   - **Body**: This is email body.  
   - **Attachment**: Supratim_demo_cv.pdf  

---

## 🛠️ Tech Stack  
- **Backend**: Java + Spring Boot  
- **Email Service**: Java Mail Sender (Spring)  
- **Build Tool**: Maven  

---

## 🤝 Contributions  
**Your contributions are welcome!** 🛠️  
1. **Fork** the repository 🍴.  
2. **Create a Branch** (`feature/YourFeatureName`) 🌿.  
3. **Commit** your changes 💾.  
4. **Push** and **Open a Pull Request (PR)** 🚀.  

---

## 📬 Contact  
For any questions or feedback, feel free to reach out to the maintainer [@sgindeed](https://github.com/sgindeed).  
