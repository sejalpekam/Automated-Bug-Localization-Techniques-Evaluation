var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":75081,"methods":[{"el":14,"sc":5,"sl":10},{"el":20,"sc":5,"sl":16},{"el":26,"sc":5,"sl":22}],"name":"IntegerFieldDeserializerTest","sl":8},{"el":49,"id":75093,"methods":[{"el":35,"sc":9,"sl":33},{"el":39,"sc":9,"sl":37},{"el":43,"sc":9,"sl":41},{"el":47,"sc":9,"sl":45}],"name":"IntegerFieldDeserializerTest.Entity","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2120":{"methods":[{"sl":10},{"sl":33},{"sl":41},{"sl":45}],"name":"test_0","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":34},{"sl":42},{"sl":46}]},"test_412":{"methods":[{"sl":22}],"name":"test_2","pass":false,"statements":[{"sl":23}]},"test_4281":{"methods":[{"sl":16},{"sl":37}],"name":"test_1","pass":false,"statements":[{"sl":17},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2120], [2120], [2120], [2120], [], [], [4281], [4281], [], [], [], [], [412], [412], [], [], [], [], [], [], [], [], [], [2120], [2120], [], [], [4281], [4281], [], [], [2120], [2120], [], [], [2120], [2120], [], [], [], []]
