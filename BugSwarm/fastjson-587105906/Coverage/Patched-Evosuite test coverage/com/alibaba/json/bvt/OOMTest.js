var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":45692,"methods":[{"el":25,"sc":5,"sl":14}],"name":"OOMTest","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_123":{"methods":[{"sl":14}],"name":"test_oom","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":21},{"sl":22},{"sl":23},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [123], [], [123], [123], [123], [], [], [123], [123], [123], [123], [], []]
