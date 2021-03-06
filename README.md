---

---

# 数据结构和算法
## 排序算法

### 1.冒泡排序

​		冒泡排序是我们得最多的排序方式之一，原因是简单易实现，且原理易懂。顾名思义，冒泡排序，它的排序过程就像水中的气泡一样，一个一个上浮到水面。

![冒泡排序](E:\project\data-structure-algorithm\image\冒泡排序.gif)

>排序过程：
>
>![img](https://img2018.cnblogs.com/blog/1084627/201901/1084627-20190108101356028-1670962340.png)

### 2.选择排序

​		选择排序，顾名思义就是用逐个选择的方式来进行排序，逐个选择出数组中的最大（或最小）的元素，直到选择至最后一个元素。此时数组完成了排序。

![选择排序](E:\project\data-structure-algorithm\image\选择排序.gif)

>排序过程：
>
>​	第一步：假设第一个就是最小值
>
>​	第二步：依次跟其后的数据比较，直到找到最小的值，然后交换
>
>​	第三步：重复一、二步

### 3.插入排序

​		利用插入法对无序数组排序时，我们其实是将数组R划分成两个子区间R[1．．i-1]（已排好序的有序区）和R[i．．n]（当前未排序的部分，可称无序区）。插入排序的基本操作是将当前无序区的第1个记录R[i]插人到有序区R[1．．i-1]中适当的位置上，使R[1．．i]变为新的有序区。因为这种方法每次使有序区增加1个记录，通常称增量法。
​		插入排序与打扑克时整理手上的牌非常类似。摸来的第1张牌无须整理，此后每次从桌上的牌(无序区)中摸最上面的1张并插入左手的牌(有序区)中正确的位置上。为了找到这个正确的位置，须自左向右(或自右向左)将摸来的牌与左手中已有的牌逐一比较。

![插入排序](E:\project\data-structure-algorithm\image\插入排序.gif)

>排序过程：
>
>​	第一步：定义好待插入的值和位置，假设第一值就是需要插入的位置
>
>​	第二步：while循环查找插入的位置
>
>​	第三步：当退出while循环时，说明已经找到待插入的角标

### 4.shell排序

​		希尔排序(Shell Sort)是插入排序的一种，它是针对直接插入排序算法的改进。该方法又称缩小增量排序，因DL．Shell于1959年提出而得名。

​		希尔排序实质上是一种分组插入方法。它的基本思想是：对于n个待排序的数列，取一个小于n的整数gap(gap被称为步长)将待排序元素分成若干个组子序列，所有距离为gap的倍数的记录放在同一个组中；然后，对各组内的元素进行直接插入排序。 这一趟排序完成之后，每一个组的元素都是有序的。然后减小gap的值，并重复执行上述的分组和排序。重复这样的操作，当gap=1时，整个数列就是有序的。

>排序过程：
>
>下面以数列{80,30,60,40,20,10,50,70}为例，演示它的希尔排序过程。
>
>**第1趟：(gap=4)**
>
>![122325434993142.jpg (947×871)](https://images0.cnblogs.com/i/497634/201403/122325434993142.jpg)
>
>当gap=4时,意味着将数列分为4个组： {80,20},{30,10},{60,50},{40,70}。 对应数列： {80,30,60,40,20,10,50,70}
>对这4个组分别进行排序，排序结果： {20,80},{10,30},{50,60},{40,70}。 对应数列： {20,10,50,40,80,30,60,70}
>**第2趟：(gap=2)**
>
>![img](https://images0.cnblogs.com/i/497634/201403/122326119003263.jpg)
>
>当gap=2时,意味着将数列分为2个组：{20,50,80,60}, {10,40,30,70}。 对应数列： {20,10,50,40,80,30,60,70}
>注意：{20,50,80,60}实际上有两个有序的数列{20,80}和{50,60}组成。
>          {10,40,30,70}实际上有两个有序的数列{10,30}和{40,70}组成。
>对这2个组分别进行排序，排序结果：{20,50,60,80}, {10,30,40,70}。 对应数列： {20,10,50,30,60,40,80,70}
>
>**第3趟：(gap=1)**
>
>![122327477476249.jpg (947×614)](https://images0.cnblogs.com/i/497634/201403/122327477476249.jpg)
>
>当gap=1时,意味着将数列分为1个组：{20,10,50,30,60,40,80,70}
>注意：{20,10,50,30,60,40,80,70}实际上有两个有序的数列{20,50,60,80}和{10,30,40,70}组成。
>对这1个组分别进行排序，排序结果：{10,20,30,40,50,60,70,80}

### 5.快速排序

​		有没有既不浪费空间又可以快一点的排序算法呢？那就是“快速排序”啦！光听这个名字是不是就觉得很高端呢。假设我们现在对“6 1 2 7 9 3 4 5 10 8”这个10个数进行排序。首先在这个序列中随便找一个数作为**基准数**（不要被这个名词吓到了，就是一个用来参照的数，待会你就知道它用来做啥的了）。为了方便，就让第一个数6作为基准数吧。接下来，需要将这个序列中所有比基准数大的数放在6的右边，比基准数小的数放在6的左边，类似下面这种排列：

3 1 2 5 4 6 9 7 10 8

在初始状态下，数字6在序列的第1位。我们的目标是将6挪到序列中间的某个位置，假设这个位置是k。现在就需要寻找这个k，并且以第k位为分界点，左边的数都小于等于6，右边的数都大于等于6。想一想，你有办法可以做到这点吗？

>排序过程：
>
>方法其实很简单：分别从初始序列“6 1 2 7 9 3 4 5 10 8”两端开始“探测”。先从**右**往**左**找一个小于6的数，再从**左**往**右**找一个大于6的数，然后交换他们。这里可以用两个变量i和j，分别指向序列最左边和最右边。我们为这两个变量起个好听的名字“哨兵i”和“哨兵j”。刚开始的时候让哨兵i指向序列的最左边（即i=1），指向数字6。让哨兵j指向序列的最右边（即=10），指向数字。
>
>![这里写图片描述](https://img-blog.csdn.net/20150810105856630)
>
>首先哨兵j开始出动。因为此处设置的基准数是最左边的数，所以需要让哨兵j先出动，这一点非常重要（请自己想一想为什么）。哨兵j一步一步地向左挪动（即j–），直到找到一个小于6的数停下来。接下来哨兵i再一步一步向右挪动（即i++），直到找到一个数大于6的数停下来。最后哨兵j停在了数字5面前，哨兵i停在了数字7面前。
>
>![这里写图片描述](https://img-blog.csdn.net/20150810105908580)
>
>![这里写图片描述](https://img-blog.csdn.net/20150810105918502)
>
>现在交换哨兵i和哨兵j所指向的元素的值。交换之后的序列如下：
>
>6 1 2 **5** 9 3 4 **7** 10 8
>
>![这里写图片描述](https://img-blog.csdn.net/20150810105928634)
>
>![这里写图片描述](https://img-blog.csdn.net/20150810105938122)
>
>到此，第一次交换结束。接下来开始哨兵j继续向左挪动（再友情提醒，每次必须是哨兵j先出发）。他发现了4（比基准数6要小，满足要求）之后停了下来。哨兵i也继续向右挪动的，他发现了9（比基准数6要大，满足要求）之后停了下来。此时再次进行交换，交换之后的序列如下：
>
>6 1 2 5 **4** 3 **9** 7 10 8
>
>第二次交换结束，“探测”继续。哨兵j继续向左挪动，他发现了3（比基准数6要小，满足要求）之后又停了下来。哨兵i继续向右移动，糟啦！此时哨兵i和哨兵j相遇了，哨兵i和哨兵j都走到3面前。说明此时“探测”结束。我们将基准数6和3进行交换。交换之后的序列如下：
>
>**3** 1 2 5 4 **6** 9 7 10 8
>
>![这里写图片描述](https://img-blog.csdn.net/20150810105949306)
>
>![这里写图片描述](https://img-blog.csdn.net/20150810110000025)
>
>![这里写图片描述](https://img-blog.csdn.net/20150810110009599)
>
>到此第一轮“探测”真正结束。此时以基准数6为分界点，6左边的数都小于等于6，6右边的数都大于等于6。回顾一下刚才的过程，其实哨兵j的使命就是要找小于基准数的数，而哨兵i的使命就是要找大于基准数的数，直到i和j碰头为止。
>
>OK，解释完毕。现在基准数6已经归位，它正好处在序列的第6位。此时我们已经将原来的序列，以6为分界点拆分成了两个序列，左边的序列是“3 1 2 5 4”，右边的序列是“9 7 10 8”。接下来还需要分别处理这两个序列。因为6左边和右边的序列目前都还是很混乱的。不过不要紧，我们已经掌握了方法，接下来只要模拟刚才的方法分别处理6左边和右边的序列即可。现在先来处理6左边的序列现吧。
>
>左边的序列是“3 1 2 5 4”。请将这个序列以3为基准数进行调整，使得3左边的数都小于等于3，3右边的数都大于等于3。好了开始动笔吧
>
>如果你模拟的没有错，调整完毕之后的序列的顺序应该是：
>
>2 1 **3** 5 4
>
>OK，现在3已经归位。接下来需要处理3左边的序列“2 1”和右边的序列“5 4”。对序列“2 1”以2为基准数进行调整，处理完毕之后的序列为“1 2”，到此2已经归位。序列“1”只有一个数，也不需要进行任何处理。至此我们对序列“2 1”已全部处理完毕，得到序列是“1 2”。序列“5 4”的处理也仿照此方法，最后得到的序列如下：
>
>1 2 3 4 5 6 9 7 10 8
>
>对于序列“9 7 10 8”也模拟刚才的过程，直到不可拆分出新的子序列为止。最终将会得到这样的序列，如下
>
>1 2 3 4 5 6 7 8 9 10
>
>到此，排序完全结束。细心的同学可能已经发现，快速排序的每一轮处理其实就是将这一轮的基准数归位，直到所有的数都归位为止，排序就结束了。下面上个霸气的图来描述下整个算法的处理过程。
>
>![这里写图片描述](https://img-blog.csdn.net/20150810110155861)
>
>这是为什么呢？
>
>快速排序之所比较快，因为相比冒泡排序，每次交换是跳跃式的。每次排序的时候设置一个基准点，将小于等于基准点的数全部放到基准点的左边，将大于等于基准点的数全部放到基准点的右边。这样在每次交换的时候就不会像冒泡排序一样每次只能在相邻的数之间进行交换，交换的距离就大的多了。因此总的比较和交换次数就少了，速度自然就提高了。当然在最坏的情况下，仍可能是相邻的两个数进行了交换。因此快速排序的最差时间复杂度和冒泡排序是一样的都是O(N2)，它的平均时间复杂度为O(NlogN)。其实快速排序是基于一种叫做“二分”的思想。



