var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":18,"id":78111,"methods":[{"el":13,"sc":5,"sl":10}],"name":"LongAsStringTest","sl":9},{"el":17,"id":78114,"methods":[],"name":"LongAsStringTest.VO","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1206":{"methods":[{"sl":10}],"name":"test_0","pass":true,"statements":[{"sl":11},{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [1206], [1206], [1206], [], [], [], [], [], []]
