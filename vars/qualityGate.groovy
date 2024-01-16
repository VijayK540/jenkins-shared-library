def call(credentialsId) {
    waitForQualityGate abortPipeline: false, credentialsId: 'sonarqube-jenkins'   
}
