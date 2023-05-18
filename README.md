# Sudo on z/OS - Readme

## Introduction
Sudo is a powerful utility that enables running commands with the privileges of another user, typically root. This readme provides essential information for installing and using Sudo on z/OS, focusing on installation requirements and best practices.

## Installation as Root (UID of 0)
- Ensure that you are logged in as the root user before proceeding with the installation.

## Running the setup.sh script
- **Caution: Sudo can only be installed and configured by the root user (UID 0).**
- Running setup.sh with root privileges allows necessary system modifications and configurations.

## Using the example $INSTALL/etc/sudoers file
- After installation, locate the example `sudoers` file at `$SUDO_HOME/etc/sudoers`.
- This file defines sudo access and privileges for users and groups.
- To enable and configure Sudo, copy the example `sudoers` file to `/etc/sudoers` using: `cp $INSTALL/etc/sudoers /etc/sudoers`.
- Exercise caution when modifying the `sudoers` file to avoid security vulnerabilities.
- Modifying the `sudoers` file requires root privileges.

## Additional Resources
- For detailed information and best practices on managing sudo access and configuration, consult the [Sudo documentation](https://www.sudo.ws/releases/stable/#1.9.13p3).
