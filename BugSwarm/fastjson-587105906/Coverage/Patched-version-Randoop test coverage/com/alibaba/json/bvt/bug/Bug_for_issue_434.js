var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":19,"id":53553,"methods":[{"el":17,"sc":5,"sl":12}],"name":"Bug_for_issue_434","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4316":{"methods":[{"sl":12}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [4316], [4316], [4316], [4316], [4316], [], [], []]
