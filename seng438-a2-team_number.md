**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:      |  7   |
| -------------- | --- |
| Student Names: |   Carter Drewes  |
|                |   Farica Mago  |
|                |   Michele Pham  |
|                |   Samira Khan |

# 1 Introduction

In this lab we used automated unit testing in order to test the methods of org.jfree.data.Range (in the package org.jfree.data) and the methods of org.jfree.data.DataUtilities (in the package org.jfree.data). We tested methods from each of these classes. In order to test these methods, we used Java SE, JUnit and JMock libraries. We specifically used JMock library for testing the methods of org.jfree.data.DataUtilities (in the package org.jfree.data).

# 2 Detailed description of unit test strategy

Since we are doing Black box testing, we decided to do Equivalence Class Testing (ECT) to test the 10 methods that we had to test from both of the classes. For both of these classes we made separate test classes, i.e. the test cases for the methods of org.jfree.data.Range are in "RangeTest.java" and the test cases for the moethods of org.jfree.data.DataUtilities are in "DataUtilitiesTest.java".

The following methods were tested in RangeTest.java in the following manner:

1) getLength(): This function was tested using 

# 3 Test cases developed

Text…

// write down the name of the test methods and classes. Organize the based on
the source code method // they test. identify which tests cover which partitions
you have explained in the test strategy section //above

# 4 How the team work/effort was divided and managed

To start of the lab, each group member was responsible for familiarizing themselves with Eclipse, creating a JUnit test, and viewing the Javadoc API speifications. Then, when the group was ready to develop unit test code, we paired up and split up tasks. Samira and Farica worked on range testing, and Michele and Carter worked on DataUtilities testing. Working in pairs allows each member to be involved and can verify code for logic purposes. At the end, when each pair completed their unit tests and made sure it worked, the group came together and discussed all the tests created for feedback and approval. Finally, everyone in the team helped create the final report.  


# 5 Difficulties encountered, challenges overcome, and lessons learned

Prior to this lab, the group, in general had very minimal knowledge of JUnit testing. This is another reason why we have decided to partner up and work on two devices rather than let each member work on their own. There were some challenges/difficulties that the group encountered. For example when creating tests, we originally thought that we only needed one test per class, but with equivalence class testing, we had to create more than just one test per class. Another challenge was understanding JMock since most of the group was unfamiliar with it prior to this course. Throughout this lab, members became more comfortable with writing JUnit tests, using Eclipse, and more

# 6 Comments/feedback on the lab itself

Text…
