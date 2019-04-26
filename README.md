# BulrDemo
高斯模糊库

使用So库，Radius范围大（当范围太大时效果不理想）且效率稳定，但是效果没有使用RenderScript好

使用RenderScript，Radius范围0-25，效果好

总结：使用RenderScript 实现高斯模糊，但其缺点就是不适用于很模糊的背景图
