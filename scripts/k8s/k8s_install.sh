#!/bin/bash

if [[ $# != 1 ]]; then
    echo "$0 k8s_version"
    exit 0
fi


K8S_VERSION=$1


# turn off swap, firewall and selinux
swapoff -a

# systemctl stop firewalld
# systemctl disable firewalld
setenforce 0


# install docker and start the service
./install_docker.sh
