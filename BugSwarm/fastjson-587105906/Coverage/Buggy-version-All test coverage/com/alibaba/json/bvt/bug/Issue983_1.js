var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":57886,"methods":[{"el":17,"sc":5,"sl":13},{"el":23,"sc":5,"sl":19},{"el":29,"sc":5,"sl":25}],"name":"Issue983_1","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_15":{"methods":[{"sl":13}],"name":"test_for_issue","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16}]},"test_340":{"methods":[{"sl":25}],"name":"test_for_issue_int_int","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28}]},"test_678":{"methods":[{"sl":19}],"name":"test_for_issue_int","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [15], [15], [15], [15], [], [], [678], [678], [678], [678], [], [], [340], [340], [340], [340], [], []]
