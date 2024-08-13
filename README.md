# Environment Setup

This document provides a comprehensive guide for setting up the development environment for the project. The setup includes the Java Development Kit (JDK), Payara Server, NetBeans IDE, and Java EE version.

## Requirements

- **JDK**: Version 8
- **Payara Server**: Version 4
- **NetBeans IDE**: Version 12
- **Java EE**: Version 5

## Setup Instructions

### 1. JDK Installation

1. **Download JDK 8**: Visit the [Oracle JDK download page](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) and download the appropriate installer for your operating system.
2. **Install JDK**: Follow the installation instructions provided in the installer. 
3. **Set JAVA_HOME**: Configure the `JAVA_HOME` environment variable to point to the JDK installation directory.
   - **Windows**:
     1. Right-click on `Computer` or `This PC` and select `Properties`.
     2. Click on `Advanced system settings` and then `Environment Variables`.
     3. Click `New` under `System variables` and enter `JAVA_HOME` as the variable name and the JDK installation path as the variable value.
   - **macOS/Linux**:
     1. Open a terminal and edit your shell profile file (`.bash_profile`, `.bashrc`, or `.zshrc`).
     2. Add the line: `export JAVA_HOME=/path/to/jdk`.
     3. Save the file and run `source ~/.bash_profile` (or the corresponding file) to apply the changes.

### 2. Payara Server Installation

1. **Download Payara Server 4**: Go to the [Payara Downloads page](https://www.payara.fish/downloads) and download the Payara Server version 4.
2. **Extract the Archive**: Extract the downloaded archive to your desired installation directory.
3. **Configure Payara Server**: Follow the Payara [installation guide](https://www.payara.fish/documentation/payara-server/installation.html) to configure the server as needed.

### 3. NetBeans IDE Installation

1. **Download NetBeans IDE 12**: Visit the [NetBeans download page](https://netbeans.apache.org/download/nb-12.0.html) and download the installer for your operating system.
2. **Install NetBeans**: Run the installer and follow the on-screen instructions.
3. **Configure NetBeans**:
   - Open NetBeans IDE.
   - Go to `Tools` > `Java Platforms` and add the JDK 8 installation directory if it's not already listed.
   - Go to `Tools` > `Servers` and add Payara Server by specifying the server installation directory.

### 4. Java EE 5 Setup

1. **Download Java EE 5**: Ensure that Java EE 5 libraries are included in your project. You may need to manually include Java EE 5 libraries in NetBeans if they are not bundled with the IDE.
2. **Configure Project**: Create or open your project in NetBeans and ensure that the Java EE 5 libraries are referenced correctly.

## Verification

1. **Verify JDK Installation**: Open a terminal or command prompt and run `java -version` and `javac -version` to confirm that JDK 8 is installed correctly.
2. **Verify Payara Server**: Start Payara Server from the `bin` directory using `asadmin start-domain` and check the administration console at `http://localhost:4848` to ensure it's running.
3. **Verify NetBeans Configuration**: Open NetBeans IDE and verify that Payara Server is listed under `Services` and that your project builds and runs correctly.

## Troubleshooting

- **JDK Issues**: Ensure that `JAVA_HOME` is set correctly and that the `bin` directory of the JDK is in your system's `PATH`.
- **Payara Server Issues**: Check the server logs located in the `logs` directory for any errors and refer to the [Payara documentation](https://www.payara.fish/documentation/) for solutions.
- **NetBeans IDE Issues**: Ensure that all paths and configurations are correctly set and that you have installed all necessary plugins for Java EE development.

## Additional Resources

- [Java JDK Documentation](https://docs.oracle.com/javase/8/docs/)
- [Payara Server Documentation](https://www.payara.fish/documentation/)
- [NetBeans IDE Documentation](https://netbeans.apache.org/kb/index.html)

## License

This project is licensed under the [MIT License](LICENSE).

---

Feel free to modify the instructions as needed based on your specific setup or preferences.
