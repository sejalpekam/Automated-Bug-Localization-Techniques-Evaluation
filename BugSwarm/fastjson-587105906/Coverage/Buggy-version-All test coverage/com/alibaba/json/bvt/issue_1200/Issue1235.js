var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":38,"id":60400,"methods":[{"el":23,"sc":5,"sl":12}],"name":"Issue1235","sl":11},{"el":30,"id":60409,"methods":[],"name":"Issue1235.Area","sl":26},{"el":37,"id":60409,"methods":[],"name":"Issue1235.FloorV2","sl":33}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1455":{"methods":[{"sl":12}],"name":"test_for_issue","pass":true,"statements":[{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1455], [1455], [], [1455], [1455], [1455], [1455], [1455], [], [1455], [1455], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
