# Integrate Spring Boot with Drools


**Drools** is a Business Rule Management System (BRMS) solution. It provides a rule engine which processes facts and produces output as a result of rules and facts processing. Centralization of business logic makes it possible to introduce changes fast and cheap.

Maven: 
```
<dependency>
    <groupId>org.kie</groupId>
    <artifactId>kie-ci</artifactId>
    <version>7.1.0.Beta1</version>
</dependency>
<dependency>
    <groupId>org.drools</groupId>
    <artifactId>drools-decisiontables</artifactId>
    <version>7.1.0.Beta1</version>
</dependency>

```
Components of Drools:

- **Rules**: Business rules or DMN decisions that you define. All rules must contain at a minimum the conditions that trigger the rule and the actions that the rule dictates.

- **Facts**: Data that enters or changes in the Drools engine that the Drools engine matches to rule conditions to execute applicable rules.

- **Production memory**: Location where rules are stored in the Drools engine.

- **Working memory**: Location where facts are stored in the Drools engine.

- **Agenda**: Location where activated rules are registered and sorted (if applicable) in preparation for execution.

 <p align="center">
  <img src="https://docs.jboss.org/drools/release/7.24.0.Final/drools-docs/html_single/HybridReasoning/rule-engine-inkscape_enterprise.png"/></p>
  
**Drools Rule File (.drl)**

- **package** – this is the package name we specify in the kmodule.xml, the rule file is located inside this package
import – this is similar to Java import statement, here we need to specify the classes which we are inserting in the KnowledgeSession

- **global** – this is used to define a global level variable for a session; this can be used to pass input parameter or to get an output parameter to summarize the information for a session

- **dialect** – a dialect specifies the syntax employed in the expressions in the condition section or action section. By default the dialect is Java. Drools also support dialect mvel; it is an expression language for Java-based applications. It supports the field and method/getter access

- **rule** – this defines a rule block with a rule name

- **when** – this specifies a rule condition, in this example the conditions which are checked are Applicant having experienceInYears more than ten years and currentSalary in a certain range

- **then** – this block executes the action when the conditions in the when block met. In this example, the Applicant role is set as Manager
  
