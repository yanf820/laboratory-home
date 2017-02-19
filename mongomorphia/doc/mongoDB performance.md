# mongoDB 性能测试

## 测试工具
ycsb  
version: 0.12.0

## CPU:4core RAM:4G Storage:SSD 
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