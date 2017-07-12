Example Micro-Service project
```
User                Gateway Service     Authorization Service    Eureka Service     Registration Service      User Service
  |                       |
  |Request list           |
  |of registrations       |
  |---------------------->| Redirect to Auth
                          |-------------------->
                          | OAuth Token
                          |<--------------------
                          | Lookup Registraton
                          | Service
                          |-------------------------------------------->
                          | Registration Service
                          | Host
                          |<--------------------------------------------
                          | Request list
                          | of registrations
                          |------------------------------------------------------------------>
                                                                          Lookup User Service 
                                                                          <-------------------
                                                                          User Service Hosts  
                                                                          ------------------->
                                                                                              |Ribbon identify
                                                                                              |Loadbalanced
                                                                                              |Host
                                                                                              |---->|
                                                                                              |<----|
                                                                                              |
                                                                                              |Feign Client
                                                                                              |request list of
                                                                                              |registered users
                                                                                              |----------------->
                                                                        Challenge and verify to                   |
                                                   |<-------------------------------------------------------------|
                                                   |                    User information
                                                   |------------------------------------------------------------->|
                                                                                                  List of users   |
                                              List of Registrations                           |<------------------|
                          |<------------------------------------------------------------------|
```
