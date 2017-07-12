Example Micro-Service project
```
User                Gateway Service     Authorization Service    Service Registry     Registration Service      Profile Service
                    - Zuul              - OAuth2 UA              - Eureka             - Feign, Ribbon, Hystrix  - OAuth2 Resource Owner
  |                       |                        |                    |                     |                        |
  |Request list           |                        |                    |                     |                        |
  |of registrations       |                        |                    |                     |                        |
  |---------------------->| Redirect to Auth       |                    |                     |                        |
  |                       |-------------------->   |                    |                     |                        |
  |                       | OAuth Token            |                    |                     |                        |
  |                       |<--------------------   |                    |                     |                        |
  |                       | Lookup Registraton     |                    |                     |                        |
  |                       | Service                |                    |                     |                        |
  |                       |-------------------------------------------->|                     |                        |
  |                       | Registration Service   |                    |                     |                        |
  |                       | Host                   |                    |                     |                        |
  |                       |<--------------------------------------------|                     |                        |
  |                       | Request list           |                    |                     |                        |
  |                       | of registrations       |                    |                     |                        |
  |                       |------------------------------------------------------------------>|                        |
  |                       |                        |                      Lookup User Service |                        |
  |                       |                        |                      <-------------------|                        |
  |                       |                        |                      User Service Hosts  |                        |
  |                       |                        |                      ------------------->|                        |
  |                       |                        |                                          |Ribbon identify         |
  |                       |                        |                                          |Loadbalanced            |
  |                       |                        |                                          |Host                    |
  |                       |                        |                                          |---->|
  |                       |                        |                                          |<----|
  |                       |                        |                                          |
  |                       |                        |                                          |Feign Client
  |                       |                        |                                          |request list of
  |                       |                        |                                          |registered users
  |                       |                        |                                          |----------------------->|
  |                       |                        |                    Challenge and verify to                        |
  |                       |                        |<------------------------------------------------------------------|
  |                       |                        |                    User information                               |
  |                       |                        |------------------------------------------------------------------>|
  |                       |                                                                       List of users        |
  |                       |                   List of Registrations                           |<-----------------------|
  |                       |<------------------------------------------------------------------|
```
