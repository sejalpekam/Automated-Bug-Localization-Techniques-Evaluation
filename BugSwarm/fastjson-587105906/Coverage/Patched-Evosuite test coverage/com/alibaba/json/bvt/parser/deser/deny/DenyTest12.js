var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":75675,"methods":[{"el":21,"sc":5,"sl":11}],"name":"DenyTest12","sl":10},{"el":25,"id":75682,"methods":[],"name":"DenyTest12.Model","sl":23},{"el":29,"id":75682,"methods":[],"name":"DenyTest12.Value","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4469":{"methods":[{"sl":11}],"name":"test_deny","pass":true,"statements":[{"sl":12},{"sl":14},{"sl":15},{"sl":16},{"sl":18},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [4469], [4469], [], [4469], [4469], [4469], [], [4469], [], [4469], [], [], [], [], [], [], [], [], [], []]
