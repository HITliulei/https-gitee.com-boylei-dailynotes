# My daily notes

平时的一些学习记录，包含脚本，java代码的一些实现等。 


## My daily scripts
主要记录自己平时在ubuntu20.04系统使用下，用到的一些脚本（ubuntu为主）

- `basic_utils.sh`: 更换阿里源并安装一些基础工具
- `change.sh`: 更改一些主机配置， 修改主机名称， 关闭swap，防火墙等。 `sudo ./change.sh hostname`


### k8s: k8s集群安装
**先安装docker 在进行kubernetes的安装**
- `docker.sh`: docker的安装，将本机所有docker配置全部删除, 里面的版本为5:19.03.1亲测有效， 可以使用,`sudo ./docker.sh`
- `k8s_install.sh` `sudo ./k8s_install.sh 1.18.6` 默认1.18.6也是版本
- `k8s_gxrcio.sh` 更换镜像


### zsh: 安装zsh， 并进行相应的配置



## src ： 
记录平时使用的算法， 数据结构， 以及一些封装的工具。
- algorithm
    - sort： 各种排序算法
- utils: 
  - ConvertTo: 基础类型数组与封装类型之间的转换
  - Suppliers： 生成Collection  
- dataStructure: 
