# mongoDB 性能测试

## 测试工具
ycsb  
version: 0.12.0

## 测试结果
|Name|Config|Insert|Read|Update|

## 测试明细
## CPU:4c4t RAM:4G Storage:SSD 
### Insert 
#### recordcount: 1000000

threadcount: 2

    [OVERALL], RunTime(ms), 56931.0
    [OVERALL], Throughput(ops/sec), 17565.122692382007
    [TOTAL_GCS_PS_Scavenge], Count, 270.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 347.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.6095097574256556
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 270.0
    [TOTAL_GC_TIME], Time(ms), 347.0
    [TOTAL_GC_TIME_%], Time(%), 0.6095097574256556
    [CLEANUP], Operations, 2.0
    [CLEANUP], AverageLatency(us), 514.0
    [CLEANUP], MinLatency(us), 5.0
    [CLEANUP], MaxLatency(us), 1023.0
    [CLEANUP], 95thPercentileLatency(us), 1023.0
    [CLEANUP], 99thPercentileLatency(us), 1023.0
    [INSERT], Operations, 1000000.0
    [INSERT], AverageLatency(us), 110.085685
    [INSERT], MinLatency(us), 74.0
    [INSERT], MaxLatency(us), 968703.0
    [INSERT], 95thPercentileLatency(us), 155.0
    [INSERT], 99thPercentileLatency(us), 259.0
    [INSERT], Return=OK, 1000000

threadcount: 4

    [OVERALL], RunTime(ms), 33176.0
    [OVERALL], Throughput(ops/sec), 30142.271521581868
    [TOTAL_GCS_PS_Scavenge], Count, 113.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 222.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.6691584277791174
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 113.0
    [TOTAL_GC_TIME], Time(ms), 222.0
    [TOTAL_GC_TIME_%], Time(%), 0.6691584277791174
    [CLEANUP], Operations, 4.0
    [CLEANUP], AverageLatency(us), 301.25
    [CLEANUP], MinLatency(us), 1.0
    [CLEANUP], MaxLatency(us), 1197.0
    [CLEANUP], 95thPercentileLatency(us), 1197.0
    [CLEANUP], 99thPercentileLatency(us), 1197.0
    [INSERT], Operations, 1000000.0
    [INSERT], AverageLatency(us), 124.706641
    [INSERT], MinLatency(us), 71.0
    [INSERT], MaxLatency(us), 850431.0
    [INSERT], 95thPercentileLatency(us), 215.0
    [INSERT], 99thPercentileLatency(us), 461.0
    [INSERT], Return=OK, 1000000

threadcount: 20

    [OVERALL], RunTime(ms), 36929.0
    [OVERALL], Throughput(ops/sec), 27078.98941211514
    [TOTAL_GCS_PS_Scavenge], Count, 53.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 293.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.7934143897749737
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 53.0
    [TOTAL_GC_TIME], Time(ms), 293.0
    [TOTAL_GC_TIME_%], Time(%), 0.7934143897749737
    [CLEANUP], Operations, 20.0
    [CLEANUP], AverageLatency(us), 104.1
    [CLEANUP], MinLatency(us), 1.0
    [CLEANUP], MaxLatency(us), 2053.0
    [CLEANUP], 95thPercentileLatency(us), 6.0
    [CLEANUP], 99thPercentileLatency(us), 2053.0
    [INSERT], Operations, 1000000.0
    [INSERT], AverageLatency(us), 718.130161
    [INSERT], MinLatency(us), 59.0
    [INSERT], MaxLatency(us), 669695.0
    [INSERT], 95thPercentileLatency(us), 1748.0
    [INSERT], 99thPercentileLatency(us), 10223.0
    [INSERT], Return=OK, 1000000

  
threadcount: 40

    [OVERALL], RunTime(ms), 40734.0
    [OVERALL], Throughput(ops/sec), 24549.516374527422
    [TOTAL_GCS_PS_Scavenge], Count, 57.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 305.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.7487602494230864
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 57.0
    [TOTAL_GC_TIME], Time(ms), 305.0
    [TOTAL_GC_TIME_%], Time(%), 0.7487602494230864
    [CLEANUP], Operations, 40.0
    [CLEANUP], AverageLatency(us), 50.3
    [CLEANUP], MinLatency(us), 1.0
    [CLEANUP], MaxLatency(us), 1958.0
    [CLEANUP], 95thPercentileLatency(us), 3.0
    [CLEANUP], 99thPercentileLatency(us), 1958.0
    [INSERT], Operations, 1000000.0
    [INSERT], AverageLatency(us), 1577.852352
    [INSERT], MinLatency(us), 66.0
    [INSERT], MaxLatency(us), 844799.0
    [INSERT], 95thPercentileLatency(us), 4175.0
    [INSERT], 99thPercentileLatency(us), 23487.0
    [INSERT], Return=OK, 1000000
    
### Read
#### operationcount: 1000000

threadcount: 2

    [OVERALL], RunTime(ms), 42985.0
    [OVERALL], Throughput(ops/sec), 23263.929277654996
    [TOTAL_GCS_PS_Scavenge], Count, 286.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 285.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.6630219844131674
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 286.0
    [TOTAL_GC_TIME], Time(ms), 285.0
    [TOTAL_GC_TIME_%], Time(%), 0.6630219844131674
    [READ], Operations, 1000000.0
    [READ], AverageLatency(us), 83.478353
    [READ], MinLatency(us), 55.0
    [READ], MaxLatency(us), 34687.0
    [READ], 95thPercentileLatency(us), 127.0
    [READ], 99thPercentileLatency(us), 222.0
    [READ], Return=OK, 1000000
    [CLEANUP], Operations, 2.0
    [CLEANUP], AverageLatency(us), 593.5
    [CLEANUP], MinLatency(us), 5.0
    [CLEANUP], MaxLatency(us), 1182.0
    [CLEANUP], 95thPercentileLatency(us), 1182.0
    [CLEANUP], 99thPercentileLatency(us), 1182.0

threadcount: 4

    [OVERALL], RunTime(ms), 20792.0
    [OVERALL], Throughput(ops/sec), 48095.42131589073
    [TOTAL_GCS_PS_Scavenge], Count, 120.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 160.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.7695267410542517
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 120.0
    [TOTAL_GC_TIME], Time(ms), 160.0
    [TOTAL_GC_TIME_%], Time(%), 0.7695267410542517
    [READ], Operations, 1000000.0
    [READ], AverageLatency(us), 79.799019
    [READ], MinLatency(us), 49.0
    [READ], MaxLatency(us), 35583.0
    [READ], 95thPercentileLatency(us), 138.0
    [READ], 99thPercentileLatency(us), 278.0
    [READ], Return=OK, 1000000
    [CLEANUP], Operations, 4.0
    [CLEANUP], AverageLatency(us), 316.5
    [CLEANUP], MinLatency(us), 1.0
    [CLEANUP], MaxLatency(us), 1258.0
    [CLEANUP], 95thPercentileLatency(us), 1258.0
    [CLEANUP], 99thPercentileLatency(us), 1258.0
    
threadcount: 10

    [OVERALL], RunTime(ms), 22717.0
    [OVERALL], Throughput(ops/sec), 44019.896993441034
    [TOTAL_GCS_PS_Scavenge], Count, 149.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 171.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.7527402385878417
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 149.0
    [TOTAL_GC_TIME], Time(ms), 171.0
    [TOTAL_GC_TIME_%], Time(%), 0.7527402385878417
    [READ], Operations, 1000000.0
    [READ], AverageLatency(us), 220.864334
    [READ], MinLatency(us), 46.0
    [READ], MaxLatency(us), 48383.0
    [READ], 95thPercentileLatency(us), 401.0
    [READ], 99thPercentileLatency(us), 972.0
    [READ], Return=OK, 1000000
    [CLEANUP], Operations, 10.0
    [CLEANUP], AverageLatency(us), 135.8
    [CLEANUP], MinLatency(us), 1.0
    [CLEANUP], MaxLatency(us), 1344.0
    [CLEANUP], 95thPercentileLatency(us), 1344.0
    [CLEANUP], 99thPercentileLatency(us), 1344.0
    
threadcount: 20

    [OVERALL], RunTime(ms), 24703.0
    [OVERALL], Throughput(ops/sec), 40480.9132494029
    [TOTAL_GCS_PS_Scavenge], Count, 97.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 221.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.8946281828118041
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 97.0
    [TOTAL_GC_TIME], Time(ms), 221.0
    [TOTAL_GC_TIME_%], Time(%), 0.8946281828118041
    [READ], Operations, 1000000.0
    [READ], AverageLatency(us), 478.462106
    [READ], MinLatency(us), 51.0
    [READ], MaxLatency(us), 150271.0
    [READ], 95thPercentileLatency(us), 907.0
    [READ], 99thPercentileLatency(us), 2945.0
    [READ], Return=OK, 1000000
    [CLEANUP], Operations, 20.0
    [CLEANUP], AverageLatency(us), 133.5
    [CLEANUP], MinLatency(us), 1.0
    [CLEANUP], MaxLatency(us), 2643.0
    [CLEANUP], 95thPercentileLatency(us), 5.0
    [CLEANUP], 99thPercentileLatency(us), 2643.0
    
### Update
#### operationcount: 1000000

threadcount: 2

    [OVERALL], RunTime(ms), 59944.0
    [OVERALL], Throughput(ops/sec), 16682.236754304016
    [TOTAL_GCS_PS_Scavenge], Count, 168.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 252.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.4203923662084612
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 168.0
    [TOTAL_GC_TIME], Time(ms), 252.0
    [TOTAL_GC_TIME_%], Time(%), 0.4203923662084612
    [CLEANUP], Operations, 2.0
    [CLEANUP], AverageLatency(us), 600.5
    [CLEANUP], MinLatency(us), 5.0
    [CLEANUP], MaxLatency(us), 1196.0
    [CLEANUP], 95thPercentileLatency(us), 1196.0
    [CLEANUP], 99thPercentileLatency(us), 1196.0
    [UPDATE], Operations, 1000000.0
    [UPDATE], AverageLatency(us), 117.013534
    [UPDATE], MinLatency(us), 83.0
    [UPDATE], MaxLatency(us), 39391.0
    [UPDATE], 95thPercentileLatency(us), 174.0
    [UPDATE], 99thPercentileLatency(us), 315.0
    [UPDATE], Return=OK, 1000000
    
threadcount: 4

    [OVERALL], RunTime(ms), 38258.0
    [OVERALL], Throughput(ops/sec), 26138.324010664437
    [TOTAL_GCS_PS_Scavenge], Count, 104.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 291.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.7606252287103351
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 104.0
    [TOTAL_GC_TIME], Time(ms), 291.0
    [TOTAL_GC_TIME_%], Time(%), 0.7606252287103351
    [CLEANUP], Operations, 4.0
    [CLEANUP], AverageLatency(us), 334.0
    [CLEANUP], MinLatency(us), 1.0
    [CLEANUP], MaxLatency(us), 1330.0
    [CLEANUP], 95thPercentileLatency(us), 1330.0
    [CLEANUP], 99thPercentileLatency(us), 1330.0
    [UPDATE], Operations, 1000000.0
    [UPDATE], AverageLatency(us), 148.931993
    [UPDATE], MinLatency(us), 81.0
    [UPDATE], MaxLatency(us), 98879.0
    [UPDATE], 95thPercentileLatency(us), 236.0
    [UPDATE], 99thPercentileLatency(us), 718.0
    [UPDATE], Return=OK, 1000000
    
threadcount: 10

    [OVERALL], RunTime(ms), 32640.0
    [OVERALL], Throughput(ops/sec), 30637.254901960783
    [TOTAL_GCS_PS_Scavenge], Count, 133.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 173.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.5300245098039216
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 133.0
    [TOTAL_GC_TIME], Time(ms), 173.0
    [TOTAL_GC_TIME_%], Time(%), 0.5300245098039216
    [CLEANUP], Operations, 10.0
    [CLEANUP], AverageLatency(us), 146.6
    [CLEANUP], MinLatency(us), 1.0
    [CLEANUP], MaxLatency(us), 1453.0
    [CLEANUP], 95thPercentileLatency(us), 1453.0
    [CLEANUP], 99thPercentileLatency(us), 1453.0
    [UPDATE], Operations, 1000000.0
    [UPDATE], AverageLatency(us), 316.889357
    [UPDATE], MinLatency(us), 80.0
    [UPDATE], MaxLatency(us), 108479.0
    [UPDATE], 95thPercentileLatency(us), 603.0
    [UPDATE], 99thPercentileLatency(us), 2001.0
    [UPDATE], Return=OK, 1000000

threadcount: 15

    [OVERALL], RunTime(ms), 38396.0
    [OVERALL], Throughput(ops/sec), 26044.379622877383
    [TOTAL_GCS_PS_Scavenge], Count, 81.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 245.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.6380873007604959
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 81.0
    [TOTAL_GC_TIME], Time(ms), 245.0
    [TOTAL_GC_TIME_%], Time(%), 0.6380873007604959
    [CLEANUP], Operations, 15.0
    [CLEANUP], AverageLatency(us), 126.06666666666666
    [CLEANUP], MinLatency(us), 1.0
    [CLEANUP], MaxLatency(us), 1871.0
    [CLEANUP], 95thPercentileLatency(us), 7.0
    [CLEANUP], 99thPercentileLatency(us), 1871.0
    [UPDATE], Operations, 1000000.0
    [UPDATE], AverageLatency(us), 561.752592
    [UPDATE], MinLatency(us), 81.0
    [UPDATE], MaxLatency(us), 208127.0
    [UPDATE], 95thPercentileLatency(us), 1218.0
    [UPDATE], 99thPercentileLatency(us), 6603.0
    [UPDATE], Return=OK, 1000000

threadcount: 20

    [OVERALL], RunTime(ms), 35970.0
    [OVERALL], Throughput(ops/sec), 27800.945232137892
    [TOTAL_GCS_PS_Scavenge], Count, 103.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 200.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.5560189046427579
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 103.0
    [TOTAL_GC_TIME], Time(ms), 200.0
    [TOTAL_GC_TIME_%], Time(%), 0.5560189046427579
    [CLEANUP], Operations, 20.0
    [CLEANUP], AverageLatency(us), 75.65
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 1488.0
    [CLEANUP], 95thPercentileLatency(us), 5.0
    [CLEANUP], 99thPercentileLatency(us), 1488.0
    [UPDATE], Operations, 1000000.0
    [UPDATE], AverageLatency(us), 696.255936
    [UPDATE], MinLatency(us), 81.0
    [UPDATE], MaxLatency(us), 287487.0
    [UPDATE], 95thPercentileLatency(us), 1600.0
    [UPDATE], 99thPercentileLatency(us), 9559.0
    [UPDATE], Return=OK, 1000000
    

## CPU:4c8t RAM:4G Storage:SSD 
### Insert 
#### recordcount: 1000000
threadcount: 4

    [OVERALL], RunTime(ms), 32098.0
    [OVERALL], Throughput(ops/sec), 31154.589070970153
    [TOTAL_GCS_PS_Scavenge], Count, 253.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 141.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.4392797059006792
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 253.0
    [TOTAL_GC_TIME], Time(ms), 141.0
    [TOTAL_GC_TIME_%], Time(%), 0.4392797059006792
    [CLEANUP], Operations, 4.0
    [CLEANUP], AverageLatency(us), 218.25
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 864.0
    [CLEANUP], 95thPercentileLatency(us), 864.0
    [CLEANUP], 99thPercentileLatency(us), 864.0
    [INSERT], Operations, 1000000.0
    [INSERT], AverageLatency(us), 125.31181
    [INSERT], MinLatency(us), 49.0
    [INSERT], MaxLatency(us), 2605055.0
    [INSERT], 95thPercentileLatency(us), 95.0
    [INSERT], 99thPercentileLatency(us), 208.0
    [INSERT], Return=OK, 1000000

threadcount: 8

    [OVERALL], RunTime(ms), 24890.0
    [OVERALL], Throughput(ops/sec), 40176.77782241864
    [TOTAL_GCS_PS_Scavenge], Count, 199.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 140.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.5624748895138609
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 199.0
    [TOTAL_GC_TIME], Time(ms), 140.0
    [TOTAL_GC_TIME_%], Time(%), 0.5624748895138609
    [CLEANUP], Operations, 8.0
    [CLEANUP], AverageLatency(us), 124.625
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 985.0
    [CLEANUP], 95thPercentileLatency(us), 985.0
    [CLEANUP], 99thPercentileLatency(us), 985.0
    [INSERT], Operations, 1000000.0
    [INSERT], AverageLatency(us), 193.651266
    [INSERT], MinLatency(us), 48.0
    [INSERT], MaxLatency(us), 4288511.0
    [INSERT], 95thPercentileLatency(us), 188.0
    [INSERT], 99thPercentileLatency(us), 379.0
    [INSERT], Return=OK, 1000000
    
threadcount: 10

    [OVERALL], RunTime(ms), 24254.0
    [OVERALL], Throughput(ops/sec), 41230.312525768946
    [TOTAL_GCS_PS_Scavenge], Count, 146.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 115.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.47414859404634285
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 146.0
    [TOTAL_GC_TIME], Time(ms), 115.0
    [TOTAL_GC_TIME_%], Time(%), 0.47414859404634285
    [CLEANUP], Operations, 10.0
    [CLEANUP], AverageLatency(us), 100.8
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 995.0
    [CLEANUP], 95thPercentileLatency(us), 995.0
    [CLEANUP], 99thPercentileLatency(us), 995.0
    [INSERT], Operations, 1000000.0
    [INSERT], AverageLatency(us), 236.226611
    [INSERT], MinLatency(us), 47.0
    [INSERT], MaxLatency(us), 4263935.0
    [INSERT], 95thPercentileLatency(us), 242.0
    [INSERT], 99thPercentileLatency(us), 533.0
    [INSERT], Return=OK, 1000000
    
***threadcount: 13***

    [OVERALL], RunTime(ms), 22026.0
    [OVERALL], Throughput(ops/sec), 45400.88985744121
    [TOTAL_GCS_PS_Scavenge], Count, 181.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 133.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.603831835103968
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 181.0
    [TOTAL_GC_TIME], Time(ms), 133.0
    [TOTAL_GC_TIME_%], Time(%), 0.603831835103968
    [CLEANUP], Operations, 13.0
    [CLEANUP], AverageLatency(us), 101.3076923076923
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 1299.0
    [CLEANUP], 95thPercentileLatency(us), 8.0
    [CLEANUP], 99thPercentileLatency(us), 1299.0
    [INSERT], Operations, 1000000.0
    [INSERT], AverageLatency(us), 272.788386
    [INSERT], MinLatency(us), 46.0
    [INSERT], MaxLatency(us), 1586175.0
    [INSERT], 95thPercentileLatency(us), 363.0
    [INSERT], 99thPercentileLatency(us), 837.0
    [INSERT], Return=OK, 1000000
   
threadcount: 14
   
    [OVERALL], RunTime(ms), 22913.0
    [OVERALL], Throughput(ops/sec), 43643.34657181513
    [TOTAL_GCS_PS_Scavenge], Count, 171.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 126.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.5499061668048706
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 171.0
    [TOTAL_GC_TIME], Time(ms), 126.0
    [TOTAL_GC_TIME_%], Time(%), 0.5499061668048706
    [CLEANUP], Operations, 14.0
    [CLEANUP], AverageLatency(us), 86.21428571428571
    [CLEANUP], MinLatency(us), 1.0
    [CLEANUP], MaxLatency(us), 1186.0
    [CLEANUP], 95thPercentileLatency(us), 9.0
    [CLEANUP], 99thPercentileLatency(us), 1186.0
    [INSERT], Operations, 1000000.0
    [INSERT], AverageLatency(us), 309.204437
    [INSERT], MinLatency(us), 45.0
    [INSERT], MaxLatency(us), 3680255.0
    [INSERT], 95thPercentileLatency(us), 408.0
    [INSERT], 99thPercentileLatency(us), 953.0
    [INSERT], Return=OK, 1000000
   
threadcount: 15

    [OVERALL], RunTime(ms), 23880.0
    [OVERALL], Throughput(ops/sec), 41876.04690117253
    [TOTAL_GCS_PS_Scavenge], Count, 167.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 126.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.5276381909547738
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 167.0
    [TOTAL_GC_TIME], Time(ms), 126.0
    [TOTAL_GC_TIME_%], Time(%), 0.5276381909547738
    [CLEANUP], Operations, 15.0
    [CLEANUP], AverageLatency(us), 74.93333333333334
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 1108.0
    [CLEANUP], 95thPercentileLatency(us), 9.0
    [CLEANUP], 99thPercentileLatency(us), 1108.0
    [INSERT], Operations, 1000000.0
    [INSERT], AverageLatency(us), 345.67809
    [INSERT], MinLatency(us), 45.0
    [INSERT], MaxLatency(us), 4308991.0
    [INSERT], 95thPercentileLatency(us), 457.0
    [INSERT], 99thPercentileLatency(us), 1134.0
    [INSERT], Return=OK, 1000000    
    
threadcount: 16

    [OVERALL], RunTime(ms), 23031.0
    [OVERALL], Throughput(ops/sec), 43419.73861317355
    [TOTAL_GCS_PS_Scavenge], Count, 168.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 122.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.5297208110807172
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 168.0
    [TOTAL_GC_TIME], Time(ms), 122.0
    [TOTAL_GC_TIME_%], Time(%), 0.5297208110807172
    [CLEANUP], Operations, 16.0
    [CLEANUP], AverageLatency(us), 80.3125
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 1263.0
    [CLEANUP], 95thPercentileLatency(us), 9.0
    [CLEANUP], 99thPercentileLatency(us), 1263.0
    [INSERT], Operations, 1000000.0
    [INSERT], AverageLatency(us), 348.093187
    [INSERT], MinLatency(us), 45.0
    [INSERT], MaxLatency(us), 4374527.0
    [INSERT], 95thPercentileLatency(us), 511.0
    [INSERT], 99thPercentileLatency(us), 1244.0
    [INSERT], Return=OK, 1000000
    
threadcount: 20

    [OVERALL], RunTime(ms), 25325.0
    [OVERALL], Throughput(ops/sec), 39486.673247778876
    [TOTAL_GCS_PS_Scavenge], Count, 163.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 130.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.5133267522211253
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 163.0
    [TOTAL_GC_TIME], Time(ms), 130.0
    [TOTAL_GC_TIME_%], Time(%), 0.5133267522211253
    [CLEANUP], Operations, 20.0
    [CLEANUP], AverageLatency(us), 74.4
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 1467.0
    [CLEANUP], 95thPercentileLatency(us), 9.0
    [CLEANUP], 99thPercentileLatency(us), 1467.0
    [INSERT], Operations, 1000000.0
    [INSERT], AverageLatency(us), 493.020819
    [INSERT], MinLatency(us), 47.0
    [INSERT], MaxLatency(us), 4415487.0
    [INSERT], 95thPercentileLatency(us), 844.0
    [INSERT], 99thPercentileLatency(us), 2505.0
    [INSERT], Return=OK, 1000000
    
### Read
#### operationcount: 1000000

threadcount: 10

    [OVERALL], RunTime(ms), 10493.0
    [OVERALL], Throughput(ops/sec), 95301.62965786715
    [TOTAL_GCS_PS_Scavenge], Count, 84.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 80.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.7624130372629372
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 84.0
    [TOTAL_GC_TIME], Time(ms), 80.0
    [TOTAL_GC_TIME_%], Time(%), 0.7624130372629372
    [CLEANUP], Operations, 10.0
    [CLEANUP], AverageLatency(us), 96.9
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 957.0
    [CLEANUP], 95thPercentileLatency(us), 957.0
    [CLEANUP], 99thPercentileLatency(us), 957.0
    [READ], Operations, 1000000.0
    [READ], AverageLatency(us), 100.154746
    [READ], MinLatency(us), 39.0
    [READ], MaxLatency(us), 33887.0
    [READ], 95thPercentileLatency(us), 178.0
    [READ], 99thPercentileLatency(us), 356.0
    [READ], Return=OK, 1000000

threadcount: 11

    [OVERALL], RunTime(ms), 10255.0
    [OVERALL], Throughput(ops/sec), 97513.40809361287
    [TOTAL_GCS_PS_Scavenge], Count, 88.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 80.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.7801072647489029
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 88.0
    [TOTAL_GC_TIME], Time(ms), 80.0
    [TOTAL_GC_TIME_%], Time(%), 0.7801072647489029
    [CLEANUP], Operations, 11.0
    [CLEANUP], AverageLatency(us), 84.36363636363636
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 917.0
    [CLEANUP], 95thPercentileLatency(us), 9.0
    [CLEANUP], 99thPercentileLatency(us), 917.0
    [READ], Operations, 1000000.0
    [READ], AverageLatency(us), 107.725827
    [READ], MinLatency(us), 31.0
    [READ], MaxLatency(us), 34399.0
    [READ], 95thPercentileLatency(us), 191.0
    [READ], 99thPercentileLatency(us), 406.0
    [READ], Return=OK, 1000000

threadcount: 12

    [OVERALL], RunTime(ms), 10343.0
    [OVERALL], Throughput(ops/sec), 96683.74746205163
    [TOTAL_GCS_PS_Scavenge], Count, 93.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 71.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.6864546069805666
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 93.0
    [TOTAL_GC_TIME], Time(ms), 71.0
    [TOTAL_GC_TIME_%], Time(%), 0.6864546069805666
    [CLEANUP], Operations, 12.0
    [CLEANUP], AverageLatency(us), 83.58333333333333
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 994.0
    [CLEANUP], 95thPercentileLatency(us), 7.0
    [CLEANUP], 99thPercentileLatency(us), 994.0
    [READ], Operations, 1000000.0
    [READ], AverageLatency(us), 118.721422
    [READ], MinLatency(us), 30.0
    [READ], MaxLatency(us), 38847.0
    [READ], 95thPercentileLatency(us), 216.0
    [READ], 99thPercentileLatency(us), 506.0
    [READ], Return=OK, 1000000

***threadcount: 13***

    [OVERALL], RunTime(ms), 10295.0
    [OVERALL], Throughput(ops/sec), 97134.53132588635
    [TOTAL_GCS_PS_Scavenge], Count, 84.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 66.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.6410879067508499
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 84.0
    [TOTAL_GC_TIME], Time(ms), 66.0
    [TOTAL_GC_TIME_%], Time(%), 0.6410879067508499
    [CLEANUP], Operations, 13.0
    [CLEANUP], AverageLatency(us), 78.46153846153847
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 1012.0
    [CLEANUP], 95thPercentileLatency(us), 5.0
    [CLEANUP], 99thPercentileLatency(us), 1012.0
    [READ], Operations, 1000000.0
    [READ], AverageLatency(us), 128.179104
    [READ], MinLatency(us), 30.0
    [READ], MaxLatency(us), 38111.0
    [READ], 95thPercentileLatency(us), 237.0
    [READ], 99thPercentileLatency(us), 524.0
    [READ], Return=OK, 1000000
    
threadcount: 15
    
    [OVERALL], RunTime(ms), 10524.0
    [OVERALL], Throughput(ops/sec), 95020.90459901179
    [TOTAL_GCS_PS_Scavenge], Count, 85.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 68.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.6461421512732801
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 85.0
    [TOTAL_GC_TIME], Time(ms), 68.0
    [TOTAL_GC_TIME_%], Time(%), 0.6461421512732801
    [CLEANUP], Operations, 15.0
    [CLEANUP], AverageLatency(us), 75.53333333333333
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 1122.0
    [CLEANUP], 95thPercentileLatency(us), 9.0
    [CLEANUP], 99thPercentileLatency(us), 1122.0
    [READ], Operations, 1000000.0
    [READ], AverageLatency(us), 151.109696
    [READ], MinLatency(us), 31.0
    [READ], MaxLatency(us), 34559.0
    [READ], 95thPercentileLatency(us), 285.0
    [READ], 99thPercentileLatency(us), 675.0
    [READ], Return=OK, 1000000
    
threadcount: 16
    
    [OVERALL], RunTime(ms), 10570.0
    [OVERALL], Throughput(ops/sec), 94607.37937559129
    [TOTAL_GCS_PS_Scavenge], Count, 89.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 70.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.6622516556291391
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 89.0
    [TOTAL_GC_TIME], Time(ms), 70.0
    [TOTAL_GC_TIME_%], Time(%), 0.6622516556291391
    [CLEANUP], Operations, 16.0
    [CLEANUP], AverageLatency(us), 67.8125
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 1075.0
    [CLEANUP], 95thPercentileLatency(us), 8.0
    [CLEANUP], 99thPercentileLatency(us), 1075.0
    [READ], Operations, 1000000.0
    [READ], AverageLatency(us), 162.11134
    [READ], MinLatency(us), 32.0
    [READ], MaxLatency(us), 36543.0
    [READ], 95thPercentileLatency(us), 307.0
    [READ], 99thPercentileLatency(us), 683.0
    [READ], Return=OK, 1000000
    
threadcount: 20

    [OVERALL], RunTime(ms), 11081.0
    [OVERALL], Throughput(ops/sec), 90244.5627650934
    [TOTAL_GCS_PS_Scavenge], Count, 85.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 70.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.6317119393556538
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 85.0
    [TOTAL_GC_TIME], Time(ms), 70.0
    [TOTAL_GC_TIME_%], Time(%), 0.6317119393556538
    [CLEANUP], Operations, 20.0
    [CLEANUP], AverageLatency(us), 58.5
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 1156.0
    [CLEANUP], 95thPercentileLatency(us), 9.0
    [CLEANUP], 99thPercentileLatency(us), 1156.0
    [READ], Operations, 1000000.0
    [READ], AverageLatency(us), 212.109978
    [READ], MinLatency(us), 31.0
    [READ], MaxLatency(us), 40127.0
    [READ], 95thPercentileLatency(us), 427.0
    [READ], 99thPercentileLatency(us), 961.0
    [READ], Return=OK, 1000000
    
### Update
#### operationcount: 1000000

threadcount: 8

    [OVERALL], RunTime(ms), 22066.0
    [OVERALL], Throughput(ops/sec), 45318.58968548899
    [TOTAL_GCS_PS_Scavenge], Count, 174.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 123.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.5574186531315145
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 174.0
    [TOTAL_GC_TIME], Time(ms), 123.0
    [TOTAL_GC_TIME_%], Time(%), 0.5574186531315145
    [CLEANUP], Operations, 8.0
    [CLEANUP], AverageLatency(us), 127.625
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 1014.0
    [CLEANUP], 95thPercentileLatency(us), 1014.0
    [CLEANUP], 99thPercentileLatency(us), 1014.0
    [UPDATE], Operations, 1000000.0
    [UPDATE], AverageLatency(us), 171.522142
    [UPDATE], MinLatency(us), 52.0
    [UPDATE], MaxLatency(us), 109439.0
    [UPDATE], 95thPercentileLatency(us), 189.0
    [UPDATE], 99thPercentileLatency(us), 399.0
    [UPDATE], Return=OK, 1000000

threadcount: 10

    [OVERALL], RunTime(ms), 21027.0
    [OVERALL], Throughput(ops/sec), 47557.90174537499
    [TOTAL_GCS_PS_Scavenge], Count, 169.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 119.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.5659390307699624
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 169.0
    [TOTAL_GC_TIME], Time(ms), 119.0
    [TOTAL_GC_TIME_%], Time(%), 0.5659390307699624
    [CLEANUP], Operations, 10.0
    [CLEANUP], AverageLatency(us), 106.4
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 1053.0
    [CLEANUP], 95thPercentileLatency(us), 1053.0
    [CLEANUP], 99thPercentileLatency(us), 1053.0
    [UPDATE], Operations, 1000000.0
    [UPDATE], AverageLatency(us), 203.889549
    [UPDATE], MinLatency(us), 56.0
    [UPDATE], MaxLatency(us), 129279.0
    [UPDATE], 95thPercentileLatency(us), 237.0
    [UPDATE], 99thPercentileLatency(us), 486.0
    [UPDATE], Return=OK, 1000000
    
threadcount: 12

    [OVERALL], RunTime(ms), 20087.0
    [OVERALL], Throughput(ops/sec), 49783.44202718176
    [TOTAL_GCS_PS_Scavenge], Count, 158.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 110.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.5476178622989993
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 158.0
    [TOTAL_GC_TIME], Time(ms), 110.0
    [TOTAL_GC_TIME_%], Time(%), 0.5476178622989993
    [CLEANUP], Operations, 12.0
    [CLEANUP], AverageLatency(us), 98.41666666666667
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 1164.0
    [CLEANUP], 95thPercentileLatency(us), 9.0
    [CLEANUP], 99thPercentileLatency(us), 1164.0
    [UPDATE], Operations, 1000000.0
    [UPDATE], AverageLatency(us), 232.522156
    [UPDATE], MinLatency(us), 54.0
    [UPDATE], MaxLatency(us), 246655.0
    [UPDATE], 95thPercentileLatency(us), 316.0
    [UPDATE], 99thPercentileLatency(us), 778.0
    [UPDATE], Return=OK, 1000000    
    
***threadcount: 13***

    [OVERALL], RunTime(ms), 19430.0
    [OVERALL], Throughput(ops/sec), 51466.803911477095
    [TOTAL_GCS_PS_Scavenge], Count, 139.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 101.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.5198147195059187
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 139.0
    [TOTAL_GC_TIME], Time(ms), 101.0
    [TOTAL_GC_TIME_%], Time(%), 0.5198147195059187
    [CLEANUP], Operations, 13.0
    [CLEANUP], AverageLatency(us), 95.07692307692308
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 1216.0
    [CLEANUP], 95thPercentileLatency(us), 11.0
    [CLEANUP], 99thPercentileLatency(us), 1216.0
    [UPDATE], Operations, 1000000.0
    [UPDATE], AverageLatency(us), 244.599606
    [UPDATE], MinLatency(us), 54.0
    [UPDATE], MaxLatency(us), 162943.0
    [UPDATE], 95thPercentileLatency(us), 347.0
    [UPDATE], 99thPercentileLatency(us), 777.0
    [UPDATE], Return=OK, 1000000
    

    
threadcount: 14

    [OVERALL], RunTime(ms), 19785.0
    [OVERALL], Throughput(ops/sec), 50543.34091483447
    [TOTAL_GCS_PS_Scavenge], Count, 156.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 109.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.5509224159716958
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 156.0
    [TOTAL_GC_TIME], Time(ms), 109.0
    [TOTAL_GC_TIME_%], Time(%), 0.5509224159716958
    [CLEANUP], Operations, 14.0
    [CLEANUP], AverageLatency(us), 85.42857142857143
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 1182.0
    [CLEANUP], 95thPercentileLatency(us), 6.0
    [CLEANUP], 99thPercentileLatency(us), 1182.0
    [UPDATE], Operations, 1000000.0
    [UPDATE], AverageLatency(us), 268.704694
    [UPDATE], MinLatency(us), 54.0
    [UPDATE], MaxLatency(us), 167423.0
    [UPDATE], 95thPercentileLatency(us), 392.0
    [UPDATE], 99thPercentileLatency(us), 941.0
    [UPDATE], Return=OK, 1000000
    
threadcount: 15

    [OVERALL], RunTime(ms), 19998.0
    [OVERALL], Throughput(ops/sec), 50005.00050005
    [TOTAL_GCS_PS_Scavenge], Count, 214.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 153.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.7650765076507651
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 214.0
    [TOTAL_GC_TIME], Time(ms), 153.0
    [TOTAL_GC_TIME_%], Time(%), 0.7650765076507651
    [CLEANUP], Operations, 15.0
    [CLEANUP], AverageLatency(us), 88.66666666666667
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 1312.0
    [CLEANUP], 95thPercentileLatency(us), 9.0
    [CLEANUP], 99thPercentileLatency(us), 1312.0
    [UPDATE], Operations, 1000000.0
    [UPDATE], AverageLatency(us), 290.096884
    [UPDATE], MinLatency(us), 51.0
    [UPDATE], MaxLatency(us), 125247.0
    [UPDATE], 95thPercentileLatency(us), 442.0
    [UPDATE], 99thPercentileLatency(us), 1116.0
    [UPDATE], Return=OK, 1000000
    
threadcount: 20

    [OVERALL], RunTime(ms), 20331.0
    [OVERALL], Throughput(ops/sec), 49185.97216073976
    [TOTAL_GCS_PS_Scavenge], Count, 155.0
    [TOTAL_GC_TIME_PS_Scavenge], Time(ms), 117.0
    [TOTAL_GC_TIME_%_PS_Scavenge], Time(%), 0.5754758742806552
    [TOTAL_GCS_PS_MarkSweep], Count, 0.0
    [TOTAL_GC_TIME_PS_MarkSweep], Time(ms), 0.0
    [TOTAL_GC_TIME_%_PS_MarkSweep], Time(%), 0.0
    [TOTAL_GCs], Count, 155.0
    [TOTAL_GC_TIME], Time(ms), 117.0
    [TOTAL_GC_TIME_%], Time(%), 0.5754758742806552
    [CLEANUP], Operations, 20.0
    [CLEANUP], AverageLatency(us), 79.9
    [CLEANUP], MinLatency(us), 0.0
    [CLEANUP], MaxLatency(us), 1579.0
    [CLEANUP], 95thPercentileLatency(us), 8.0
    [CLEANUP], 99thPercentileLatency(us), 1579.0
    [UPDATE], Operations, 1000000.0
    [UPDATE], AverageLatency(us), 394.612802
    [UPDATE], MinLatency(us), 54.0
    [UPDATE], MaxLatency(us), 176511.0
    [UPDATE], 95thPercentileLatency(us), 803.0
    [UPDATE], 99thPercentileLatency(us), 1978.0
    [UPDATE], Return=OK, 1000000