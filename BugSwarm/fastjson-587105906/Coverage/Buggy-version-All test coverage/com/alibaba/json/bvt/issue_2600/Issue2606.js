var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":65829,"methods":[{"el":17,"sc":5,"sl":13},{"el":25,"sc":5,"sl":19}],"name":"Issue2606","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2276":{"methods":[{"sl":19}],"name":"test_for_issue","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2276], [2276], [2276], [2276], [2276], [2276], [], []]
