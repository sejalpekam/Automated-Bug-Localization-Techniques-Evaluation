var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":64478,"methods":[{"el":22,"sc":5,"sl":13}],"name":"Issue2516","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_806":{"methods":[{"sl":13}],"name":"test_for_issue","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":18},{"sl":19},{"sl":20},{"sl":21}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [806], [806], [806], [806], [], [806], [806], [806], [806], [], []]
