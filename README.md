



# TestAssign2

### **Computer Mouse Tests:**

- Check if the sensory moves at a konstant speed

- Check if both left and right click works

- Check if double click works

- Check if scroller works 

- Test mouse on different surfaces 


### **Catastrophic failure:**

"In 1994 in Scotland, a Chinook helicopter crashed and killed all 29 passengers. While initially the pilot was blamed for the crash, that decision was later overturned since there was evidence that a systems error had been the actual cause.
Another example of a software-induced flight crash happened in 1993, when an error in the flight-control software for the Swedish JAS 39 Gripen fighter aircraft was behind a widely publicized crash in Sweden."

i have no knowledge about flight-control software, but: i'd imagine that you could simulate that the plain took flight with som mockups. One mockup test before those flights may have safed lifes. 


### **Investigation of tools:**

- @Tag: Used for crouping tests together. Usefull when you only want to execute some parts of the tests

- @Disabled: Used for disabling tests so they are skipped in execution. Usefull when you don't want to execute some of the tests

- @RepeatedTest: Used for reaping a test. 

- @BeforeEach, @AfterEach: Used for defining methods that are executed *before* and *after* each test are executed. usefull for preparations (inits) and cleaning up.

- @BeforeAll, @AfterAll:  Used for defining a single method that isexecuted *before* and *after* all test are executed. usefull for preparations (inits) and cleaning up.

- @DisplayName: Used for defining a custom display name.

- @Nested: Used for annotating that a class or method is nested. Usefull for keeping a overview of scope.

- @assumeFalse, @assumeTrue: Used for running tests, but only if a condition is *True* (or *False*)
