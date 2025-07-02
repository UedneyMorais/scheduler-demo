# ⏰ scheduler – Agendamento de Tarefas com Spring Boot

[![Java](https://img.shields.io/badge/java-17-blue)](https://openjdk.org/projects/jdk/17/)
[![Spring Boot](https://img.shields.io/badge/spring--boot-3.2.0-brightgreen)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/license-MIT-lightgrey)](LICENSE)

> Sistema demonstrativo de **agendamento de tarefas automáticas** utilizando `@Scheduled` no Spring Boot, com organização de código e boas práticas. Ideal para aprender como executar tarefas de forma periódica em aplicações Java.

---

## 📽️ Vídeo completo no YouTube

📺 **Assista no canal:**  
🔗 [https://www.youtube.com/@uedneymoraisdev](https://www.youtube.com/watch?v=sa6pfs2ZGPk&t=523s)

---

## 🚀 Funcionalidades demonstradas

- ✅ Execução periódica com `fixedRate`
- ✅ Execução com intervalo após término (`fixedDelay`)
- ✅ Tarefas agendadas com expressões `cron`
- ✅ Simulação com `Thread.sleep()` para visualizar concorrência
- ✅ Projeto estruturado por camadas (`scheduler -> services -> tasks`)
- ✅ Separação de responsabilidades e boas práticas de organização

---

## 🧠 Tecnologias utilizadas

- [Java 17](https://openjdk.org/projects/jdk/17/)
- [Spring Boot 3.2.x](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)

---

## 📁 Estrutura do Projeto

scheduler/<br>
├── src/<br>
│ └── main/<br>
│ ├── java/<br>
│ │ └── com/example/scheduler/<br>
│ │ ├── SchedulerApplication.java<br>
│ │ ├── config/<br>
│ │ │ └── SchedulingConfig.java<br>
│ │ ├── tasks/<br>
│ │ │ └── CronTask.java<br>
│ │ │ └── FixedDelayTask.java<br>
│ │ │ └── FixedRateTask.java<br>
│ │ │ └── InitialDelayTask.java<br>
│ └── resources/<br>
│ └── application.properties<br>
└── pom.xml<br>

---

## ⚙️ Como executar localmente

```bash
# Clone o repositório
git clone https://github.com/seuusuario/scheduler.git
cd scheduler

# Execute o projeto
./mvnw spring-boot:run
```
A aplicação irá iniciar em http://localhost:8080
As tarefas serão executadas no console conforme o agendamento configurado.

⏱️ Exemplos de Expressões CRON
CRON Expression	Significado
0 * * * * *	A cada minuto, no segundo zero
*/10 * * * * *	A cada 10 segundos
0 0 12 * * *	Todos os dias ao meio-dia
0 15 10 * * MON-FRI	Às 10:15 de segunda a sexta

A sintaxe CRON no Spring possui 6 campos:
segundo minuto hora dia mês dia-da-semana

📦 Agendamentos usados no projeto
```bash
@Scheduled(fixedRate = 5000)       // Executa a cada 5 segundos, independente da duração
```
```bash
@Scheduled(fixedDelay = 5000)      // Espera 5 segundos após a conclusão anterior
```
```bash
@Scheduled(cron = "*/10 * * * * *") // A cada 10 segundos (usando CRON)
```

🤝 Contribuição
Contribuições são bem-vindas!

Faça um fork do projeto

Crie sua feature branch: git checkout -b minha-feature

Commit suas mudanças: git commit -m 'feat: minha contribuição'

Push para o branch: git push origin minha-feature

Abra um Pull Request

📄 Licença
Este projeto está sob a licença MIT.

💬 Autor
Feito com 💻 por Uedney C. Morais
