# CSS 143 Computer Programming II

## How to Clone This Repo To Your Machine

On the [class repo page](https://github.com/pdgetrf/CSS143B), click the green "Clone or download" button. You can either git clone the repo or download a zip file. Here is an example on linux/mac:

```console
pdu:~$ git clone https://github.com/pdgetrf/CSS143B.git
```
And there's a [tutorial](https://help.github.com/en/articles/cloning-a-repository) on how to clone a github repo on **ALL PLATFORMS**. We will use git a lot in this course. 

## Course Info
Transition from basic programming skills to a rigorous process of software development. Familiarization with higher-level programming techniques (recursion, generic programming, stacks, queues, trees, searching, and sorting). Emphasizes the connection between algorithmic thought and implementation. 

| Key Info ||
|------------|-----------------|
| Date & Time | MW 5:45pm - 7:45pm |
| Lecturer     | Dr. [Peng Du](https://www.linkedin.com/in/peng-du-ph-d-14b0a11b) |
| Email        | pengdu@uw.edu ([CSS143] MUST show on subject) |
| Lecture Location | UW1([map](https://www.google.com/maps/place/UW1,+Campus+Way+NE,+Bothell,+WA+98011/@47.7589141,-122.1927826,17z/data=!3m1!4b1!4m5!3m4!1s0x54900e656ea5e705:0x76bf30aa903fd5d4!8m2!3d47.7589141!4d-122.1905939)) 051   |
| Office hours | 1 hr after MW class in UW1 051 |

## Prerequisites
Minimum grade of 2.7 in CSS 161, CSS 142, or CSE 142. Co-requisite: CSSSKL 143. 

## Course Objectives
The objectives of this course are for students to: 
- Transition from basic programming skills to a rigorous process of software development
- Becoming familiar with higher-level programming techniques (object‐orientation, recursion, inheritance, generic programming), constructs (lists, stacks, queues, trees) and algorithms (searching, sorting)

## Course Learning Outcomes
Upon successful completion of the course, students shall be able to:
- Be fluent with object-oriented programming using JAVA from concept to realization.
- Analyze problems and design solutions with basic data structures, algorithms.
- Make trade-offs between solutions based on performance analysis in terms of time and space complexity.
- Write well-structured and test-friendly codes.
- Debug programs with the command line and IDE tools, and online community like www.stackoverflow.com.
- Work comfortably with source control and online repo such as Git and www.github.com.

## Class Communication
- Canvas Learning Management System (LMS) will be used for homework, quizzes, and exams.
- Discord will be used for announcements, discussion forums, assignment posting, and individual grades.
- For any direct/individual communication with your instructor please use email (please do not use Canvas messaging/mail).
- For group discussion, please use Discord (invitation in canvas).

## Grading
### Coursework Distribution 
| Course Work | Grading % |
|-------------|-----------|
| Homeworks | 30        |
| Reading Quizzes and Activities      | 5        |
| Midterm exam       | 40        |
| Final exam      | 25        |
| Total | 100 |

### Grading Rubric
All grades will be listed as percentages in the Canvas LMS. The conversion table below will help you determine your final grade. For example, if you earn 950 points (or 95%) you will get a 4.0. If you earn 750 points (or 75%) you will earn a 2.0.

![Image of Grading Rubric](https://github.com/pdgetrf/CSS143B/blob/master/images/gradingrubric.png)

## Textbooks
### Required
- Savitch, Walter, Absolute Java, 6th Edition, Pearson, 2016, ISBN 0134041674.

## Lecture
- Read the relevant textbook chapters before coming to class.
- Slides are to provide outlines for the lecture, and they will be frequently updated even after the class. The main purpose of lecture slides is to give you the flow of the day's lecture.
- It is highly recommended that you take notes rather than depend solely on the slides.
- There will be live coding and debugging by both the lecture and students.

## Computer
All students are expected to have unfettered access to a personal computer (Windows, Mac, Linux, etc.) or netbook with broadband-speed Internet access. Student access to University computing resources fulfills this requirement. All students are assumed to be proficient with an office productivity suite and email. All students must enable their Canvas Notifications for this course (Links to an external site.) to be at least as frequent as the defaults; if I post announcements, etc. via Canvas, you need to be able to receive them. All students must have a valid email account that they check on a daily basis.

## Operating System
Since JAVA will be used for programming and it is cross-platform ("write once, run anywhere"), there's no specific requirement for what Operating System you can use for coding. 

## Dev Tools
Recommended: [Intellij Idea](https://www.jetbrains.com/idea/). This has a free community version and also [free for students](https://www.jetbrains.com/student/). Feel free to use any other development environments too, it being Eclipse or even VIM. For homeworks only the source codes are of interests for grading.

## What to bring to lecture
- A laptop or tablet: We'll do plenty of live coding on a computer during the lecture, and your device will be used for taking quizzes, exams, etc. 
- A writing tool and paper: Most of the work we do with programming will be done by hand. This is because coding is not about typing things into a computer, but thinking about how to tell the computer what to do.
- The textbook: We'll be talking through examples, etc.

## Class Attendance
- Class attendance is not mandatory. However, I strongly encourage you to come to class as there is generally a direct correlation between attendance and performance (aka, grade).
- Quizzes and exams will be given during class.
- You will be held responsible for learning all material covered in class, regardless of its presence (or lack thereof) in the textbook or internet.

## Programming Assignments
All programming assignments will be given at this repository, and submission shall be made to UW canvas unless specified otherwise. Late assignments will **NOT** be accepted unless there has been a previous agreement due to exceptional circumstances. 

The program is graded upon the following aspects: 

- Style / Syntax: i.e. following Coding Guidelines; Clarity 
- Factoring / Design: i.e. Modularity; Interface Design 
- Correctness – determined through test cases and memory checker run against code 
- Efficiency

You can use any IDE or editor for coding and testing your laboratory and programming assignments. Regardless of what environment and version you use to develop your programs, for grading it will be compiled in a standard environment (to be announced in class).  If your program does not compile or does not run in the graded environments it will be deemed incorrect and receive zero points. This is true even if it works with other OSs or compilers. This means that *if you use a different development environment you should verify (compile and run test) your code to the prescribed environment before submitting it*. 

When multiple files are required for an assignment, they must be in a ZIP file. The ZIP file should contain source code (in ASCII Text) and results of the program (report as an MS Word or pdf document); never submit executables. Please check each homework specification about what you to write in your report. For grading correctness the files will be extracted from the ZIP file, the code will be compiled and tested by executing several test cases. 

## Tentative Schedule
The following table provides an approximate, high-level ordering of topics, not all sections in all chapters in the book are covered.  It is also a tentative schedule subject to change and will be announced on canvas, in class and/or through our discussion channels. Furthermore, the book topics listed below are provided as guidance. You are strongly encouraged to consult other sources for further references.

|  Date | Week | Topics |
| --- | --- | --- |
|  1/6, 1/8 | 1 | Course intro <br/>Java programming basic |
|  1/13, 1/15 | 2 | 1/13 Java class Intro<br/>1/15  Overloading, constructors, and encapsulation |
|  1/20, 1/22 | 3 | 1/20 No lecture<br/>1/22 Abstract Data Type (ADT) |
|  1/27, 1/29 | 4 | 1/27 Midterm & debugging and exception<br/>1/29 LinkedList ADT |
|  2/3, 2/5 | 5 | 2/3 Stack and Queue ADT<br/>2/5 Recursion |
|  2/10, 2/12 | 6 | 2/10 Binary (Search) Tree ADT and Binary Tree overall<br/>2/12 Special topic: A tale of two linkedlist reversals |
|  2/17, 2/19 | 7 | 2/17 No lecture (Presidents' day)<br/>2/19 Midterm |
|  2/24, 2/26 | 8 | 2/24 Dictionary <br/>2/26 SortingAlgorithm & complexity analysis |
|  3/2, 3/4 | 9 | 3/2 Compresive problem solving discussion<br/>3/4 Guest lecture |
|  3/9, 3/11 | 10 | Buffer/Final review |
|  3/14 - 3/20 | 11 | 3/16 Final exam |

## Policy
All the materials are either in class or online. In-class only materials will be unavailable unless you attend class. The only exceptions are: you are terribly sick, family emergency, or academic event. In such cases, you should provide evidence (e.g., medical doctor’s note). 

- Assignments: All assignments should be done **independently** and any cheating or collaboration work will be returned without points, and will be reported as academic misconduct to the university. All assignments are required to submit online (Canvas), unless otherwise noted. Please note that **late assignments will not be accepted** under any circumstances.   
- Discussions, Exercises, and Labs: Short programming works or short questions will be given in class. You are required to finish the work in class and submit online (most cases). The works won’t be repeated outside of the class, therefore it is your responsibility to be in class to claim your points.  
- Exams: Exams cover the contents you have learned in class by the time of the exam, none of them are cumulative. There will be **no make-up exams**, either earlier or later, some exceptions might be granted, only under extenuating circumstances.  
- Quizzes: Quizzes will be given during the first 20 minutes of the class throughout the quarter. 

## Code of Conduct and Behaviour
Work is to be done independently unless directed otherwise; collaborative work is NOT acceptable. You may discuss the problem statement with each other and help debug, but all designing and coding are to be done independently. Any pair programming must be approved by me. This class is run by honor code.
- By taking this class, you agree that you will **not** collaborate inappropriately on any work. In some cultures, family relationships, and loyalty are considered above all others.
- In this course, we are an academic family and you betray the instructor’s and the university’s trust should you violate the honor code. This violation will be taken seriously. (See [Academic Conduct](http://www.uwb.edu/academic/policies/Academic_Conduct.xhtml).
- The purpose of the assignments is to help you understand deeply technical material. You may discuss the problem statement with each other and help debug, but do your own design and coding. See the student [honor code](https://www.uwb.edu/academic/policies/academic-conduct).
- Live lectures are inherently interactive. Questions during class are encouraged. Please raise your hand to get the instructor's attention. At the instructor's discretion, answers may be tabled until the end of class if they are too far off-topic.
- Limit computer use during class to note-taking so as to not distract or disturb your classmates or your instructor. It is highly recommended that you turn off the computer and take notes the old fashioned way. Quill pens are optional.
  - Computer (or handheld devices) use during the lecture is limited to taking notes and lab/exercise programming. 
  - Displaying any images or videos on your screen during the lecture is not allowed as it is distracting and disrespectful.
  - Silence your mobile phones and limited your mobile device usage. If you need to take a call or you have an emergency, step out of the classroom.
- Please, no whispering, chitchatting, giggling, etc., this is very distracting and disrespectful. Disruptive students will be asked to leave and you will be responsible for missing lectures.
- If you arrive late or have to leave in the middle of class, do so quietly without causing disruption.
- Flash photography is not permitted. Non-flash photography to capture the white-board is permitted as long as it is not disruptive or distracting.
- Simple email questions may get a response. Complex questions are best saved for office hours.
- Because of limited time, all assignment questions will be answered during office hours.
- There will be no debugging of code during the class break. You can ask short questions, but without your computer.
- Absolutely no questions after the end of the lecture, plan ahead and schedule office hours in a timely fashion.
- No office hours on exam days or during finals week.

## Disability Accommodations 
To request academic accommodations due to a disability, please contact Disabled Student Services (DSS) at 425.352.5307, 425.352.5303 TDD, 425.352.5455 FAX, or at dss@uwb.edu. You will need to provide documentation of your disability as part of the review process prior to receiving any accommodations (by the third week of the quarter). 

## Religious Accommodations
Washington state law requires that UW develop a policy for accommodation of student absences or significant hardship due to reasons of faith or conscience, or for organized religious activities. The UW’s policy, including more information about how to request an accommodation, is available at Religious Accommodations Policy (https://registrar.washington.edu/staffandfaculty/religious-accommodations-policy/). Accommodations must be requested within the first two weeks of this course using the Religious Accommodations Request form (https://registrar.washington.edu/students/religious-accommodations-request/).

## Inclement Weather Policy 
Call (206)-547-4636 (206-547-INFO) to see if University of Washington, Seattle, Bothell, and Tacoma campuses are open and operating. 

## Classroom Emergency Preparedness 
Please see http://www.uwb.edu/safety/are-you-ready for detailed information on the following topics: active shooter, inclement weather, bomb threat, crime or violence, earthquake, fire, hazardous material spill, identity theft, lockdown, medical emergency, online safety, power outage, sexual assault, student in distress, suspicious mail, theft, pandemic flu, and extreme heat. 

## For our Veterans 
If you are a student who has served in our nation’s military forces, thank you for your service. We hope that you feel comfortable enough to confidentially self-identify yourself to your instructor so s/he can help you make a successful transition from the military to higher education.

## Respect for Diversity 
- Diverse backgrounds, embodiments and experiences are essential to the critical thinking endeavor at the heart of university education. In STEM and at UW Bothell, students are expected to: 
- Respect individual differences which may include, but are not limited to: age, cultural background, disability, ethnicity, family status, gender presentation, immigration status, national origin, race, religion, sex, sexual orientation, socioeconomic status, and veteran status. 
- Engage respectfully in discussion of diverse worldviews and ideologies embedded in course readings, presentations, and artifacts, including those course materials that are at odds with personal beliefs and values.

Students seeking support around these issues can find more information and resources at http://www.uwb.edu/diversity.

## Student Support Services 
- Career Services: http://www.uwb.edu/careers, 425-352-3706 
- CSS Tutoring: http://www.uwb.edu/css/advising 
- IT Helpdesk: http://uwbit@uw.edu, 425-352-3456 
- Library: http://library.uwb.edu, 425-352-5340 
- Quantitative Skills Center: http://www.uwb.edu/qsc, 425-352-3170 
- School of STEM Advising: stemadv@uw.edu, 425-352-3746 
- Student Counseling Services: http://www.uwb.edu/studentservices/counseling, 425-352-3183 
- Student Success and Career Services: http://www.uwb.edu/studentservices/successservices, 425-352-3427 
- Writing and Communication Center: http://www.uwb.edu/wacc, 425-352-5253 
