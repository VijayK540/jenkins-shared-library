def call() {
    withKubeConfig(caCertificate: '', clusterName: '', contextName: '', credentialsId: 'k8scluster', namespace: '', restrictKubeConfigAccess: false, serverUrl: '') {
        sh "kubectl apply -f deployment.yml"
    }
}
