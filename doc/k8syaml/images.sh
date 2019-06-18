#!/bin/bash
images="kube-apiserver:v1.14.0 kube-scheduler:v1.14.0 kube-controller-manager:v1.14.0 kube-proxy:v1.14.0
etcd:3.3.10 pause:3.1"
for imageName in $images
do
echo $imageName
docker pull docker.io/mirrorgooglecontainers/$imageName
docker tag docker.io/mirrorgooglecontainers/$imageName k8s.gcr.io/$imageName
docker rmi docker.io/mirrorgooglecontainers/$imageName
done
others="coredns:1.3.1"
for other in $others
do
docker pull docker.io/coredns/$other
docker tag docker.io/coredns/$other k8s.gcr.io/$other
docker rmi docker.io/coredns/$other
done