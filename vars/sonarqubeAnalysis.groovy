def call() {
    withSonarQubeEnv(credentialsId: 'sonarqube-jenkins') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=youtube -Dsonar.projectKey=youtube '''
    }
}
