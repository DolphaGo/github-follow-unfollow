# 😉You can check your Github Following & Follower!

### Try it => [Demo Test](http://dolphago.ga)

### Aren't you curious about who is following you or who are you following?🤔

### I have a follow/unfollow check service on Instagram, but it's not on GitHub, so I just made it for fun.


### It is very Simple. All you have to do is type `your GitHub handle`.
Just Try `Run Server` and type `http://localhost:8080/check?handle={your github handle}` on your browser.

You can look this information.
1. each other's neighbors
2. Someone who's following you(not you)
3. Someone you are following(not the him)


Also, you can use this application as batch application(For Tracking)
- VM Option : `-Dspring.batch.job.names=checkFollowJob`
- ProgramArguments : handle=`{your github handle}` date=`{any form of date}` ex) handle=DolphaGo date=20211206
  - `date` parameter exist for distinguish the batch application.
- I'm set mysql db in my local pc, but you can use free for your environment.
  - go to [application.yml](/src/main/resources/application.yml). Change it to suit your situation!
  
## Version

* Java : 21
* Spring Boot : 3.4.2
* Build Tool : Gradle


## Demo

![img.png](images/img1.png)
