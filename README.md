# CS-320-
MODULE 8 TESTING
10/25/2026

How can I ensure that my code, program, or software is functional and secure?
I can help ensure that my software is functional and secure by starting with clear requirements, testing throughout development, and reviewing the code for possible problems. I need to check that the program does what it is supposed to do, but also see how it handles invalid information and unexpected situations. Security also means thinking about how information is accepted, stored, and accessed instead of only focusing on whether a feature works. Testing and reviewing the code after changes helps me catch problems rather than assume everything still works.
In the contact service program, I applied this approach by using JUnit tests to check the requirements for contact information and service operations. These tests checked things like required fields, length limits, unique IDs, and adding, updating, or deleting contacts. Input validation helped prevent information that did not meet the requirements from being accepted. This gave me more confidence in the program’s behavior, but I would still need additional reviews and security testing before considering it ready for real world use.

How do I interpret user needs and incorporate them into a program?
I start by breaking the requirements into smaller pieces so I understand what the program needs to do and what restrictions it needs to follow. For the contact service, that includes the information a contact must have and the actions the service must support. I can then use those requirements to guide both the code and the test cases. If something is unclear, I think it is better to ask questions than to make an assumption that could lead to the wrong result.

How do I approach designing software?
I approach software design by figuring out the main responsibilities of the program before trying to write everything at once. For this project, separating the contact information from the service operations helped keep those responsibilities clear. I prefer to work on smaller sections, test them, and make adjustments before moving on. I also want my code to be straightforward enough that I can come back later and understand why I wrote it that way. Overall my goal is to meet the requirements without making the design more complicated than it needs to be.

