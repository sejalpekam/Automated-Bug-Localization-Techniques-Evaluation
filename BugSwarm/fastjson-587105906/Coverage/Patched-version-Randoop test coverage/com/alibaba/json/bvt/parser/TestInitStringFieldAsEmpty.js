var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":71781,"methods":[{"el":14,"sc":5,"sl":11},{"el":19,"sc":5,"sl":16}],"name":"TestInitStringFieldAsEmpty","sl":9},{"el":32,"id":71787,"methods":[{"el":27,"sc":9,"sl":25},{"el":31,"sc":9,"sl":29}],"name":"TestInitStringFieldAsEmpty.VO1","sl":21},{"el":49,"id":71791,"methods":[{"el":40,"sc":9,"sl":38},{"el":44,"sc":9,"sl":42},{"el":48,"sc":9,"sl":46}],"name":"TestInitStringFieldAsEmpty.VO2","sl":34}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2000":{"methods":[{"sl":16},{"sl":38},{"sl":42}],"name":"test_public","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":43}]},"test_4812":{"methods":[{"sl":11},{"sl":25},{"sl":29}],"name":"test_private","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":26},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [4812], [4812], [4812], [], [], [2000], [2000], [2000], [], [], [], [], [], [], [4812], [4812], [], [], [4812], [4812], [], [], [], [], [], [], [], [2000], [], [], [], [2000], [2000], [], [], [], [], [], [], []]
