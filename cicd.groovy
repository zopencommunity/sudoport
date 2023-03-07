node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/sudoport.git'), string(name: 'PORT_DESCRIPTION', value: 'allows a system administrator to delegate authority to give certain users' )]
  }
}
