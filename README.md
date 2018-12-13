# meetup-next-example

1. Install Docker
   1. https://docs.docker.com/install/
1. Test Docker installation:
   1. `$ docker version`
   1. `$ docker ps`
1. Run hello-world image as a container
   ```
    $ docker run hello-world
       
    Unable to find image 'hello-world:latest' locally
    latest: Pulling from library/hello-world
    d1725b59e92d: Pull complete
    Digest: sha256:0add3ace90ecb4adbf7777e9aacf18357296e799f81cabc9fde470971e499788
    Status: Downloaded newer image for hello-world:latest

    Hello from Docker!
    This message shows that your installation appears to be working correctly.
    ```
1. Install JDK 1.8+
1. Install maven 3.5+
1. Create Java App
   1. https://thorntail.io/
   1. Generate project
      1. Set a group Id: io.augusto
      1. Set a artifact Id: meetup-next-example
      1. Select JAX-RS, JSON-P, CDI
      1. Generate Project
   1. Unzip project
   1. Add project files to your github repo
1. Add project to your github repo
1. Run meetup-next-example project, and go to: http://localhost:8080/hello
1. Add a Dockerfile to the project
