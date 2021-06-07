# GlucoseLib
API for [Glucose](https://github.com/GlucoseDev/Glucose) Minecraft server software
**Currently under heavy development and is not stable!**
## How to
**DISCLAIMER: THE API HAS NOT BEEN CREATED YET, THE FOLLOWING CODE IS A DRAFT**
### Basic command
#### MyCommand Class
```java
public class MyCommand extends GlucoseCommand {
 public void onServerCommand(CommandSender sender, String[] args, Command command) {
   sender.sendMessage(ChatColors.GREEN, "Hello!");
 }
}
```
#### In your main class serverStartEvent
```java
public void serverStartEvent(){
  glucose.registerCommand("hello").executor(new myCommand());
}
```
### Maven repo
Not out yet but it will probably look something like this:
```html
<dependencies>
    <dependency>
        <groupID>glucose</groupID>
        <artifactId>GlucoseLib</artifactId>
        <version>1.0</version>
    </dependency>
</dependencies>
```
## Contributing
To contribute, make a fork of this repository, commit your changes and open a pull request.
