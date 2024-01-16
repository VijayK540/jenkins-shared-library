def call() {
    withKubeConfig(caCertificate: '', clusterName: '', contextName: '', credentialsId: 'k8scluster', namespace: '', restrictKubeConfigAccess: false, serverUrl: '') {
        sh "kubectl delete -f deployment.yml"
    }
}
