var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":41,"id":56626,"methods":[{"el":19,"sc":5,"sl":16},{"el":27,"sc":5,"sl":21},{"el":35,"sc":5,"sl":29}],"name":"Issue978","sl":15},{"el":40,"id":56639,"methods":[],"name":"Issue978.Model","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2419":{"methods":[{"sl":29}],"name":"test_for_issue2","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":33},{"sl":34}]},"test_683":{"methods":[{"sl":21}],"name":"test_for_issue","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":25},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [683], [683], [683], [], [683], [683], [], [], [2419], [2419], [2419], [], [2419], [2419], [], [], [], [], [], [], []]
