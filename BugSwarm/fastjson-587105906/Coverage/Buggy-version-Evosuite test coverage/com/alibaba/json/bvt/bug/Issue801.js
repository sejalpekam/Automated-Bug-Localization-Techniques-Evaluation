var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":57419,"methods":[{"el":16,"sc":5,"sl":13}],"name":"Issue801","sl":12},{"el":21,"id":57422,"methods":[],"name":"Issue801.Model","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1703":{"methods":[{"sl":13}],"name":"test_for_issue","pass":true,"statements":[{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [1703], [1703], [1703], [], [], [], [], [], [], []]
