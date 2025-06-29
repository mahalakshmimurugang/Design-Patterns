Purpose:
* Ensures a class has only one instance and provides global access to it.

Problem Solved:
* Need exactly one instance of a class (database connection, logger, configuration manager)
* Global access point required
* Control instantiation process

When to Use:
* Configuration managers
* Database connection pools
* Logging services
* Cache implementations
* Thread pools

Pros:
* Controlled access to sole instance
* Lazy initialization
* Global access point

Cons:
* Difficult to unit test
* Violates Single Responsibility Principle
* Can create tight coupling