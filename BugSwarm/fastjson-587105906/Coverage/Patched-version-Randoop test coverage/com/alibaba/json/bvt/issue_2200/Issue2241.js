var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":80,"id":64879,"methods":[{"el":18,"sc":5,"sl":15},{"el":28,"sc":5,"sl":20},{"el":38,"sc":5,"sl":30},{"el":48,"sc":5,"sl":40},{"el":58,"sc":5,"sl":50}],"name":"Issue2241","sl":14},{"el":63,"id":64906,"methods":[],"name":"Issue2241.Order","sl":60},{"el":68,"id":64906,"methods":[],"name":"Issue2241.Order2","sl":65},{"el":73,"id":64906,"methods":[],"name":"Issue2241.Order3","sl":70},{"el":78,"id":64906,"methods":[],"name":"Issue2241.Order4","sl":75}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1568":{"methods":[{"sl":20}],"name":"test_for_issue","pass":true,"statements":[{"sl":21},{"sl":23},{"sl":24},{"sl":26},{"sl":27}]},"test_333":{"methods":[{"sl":50}],"name":"test_for_issue4","pass":true,"statements":[{"sl":51},{"sl":53},{"sl":54},{"sl":56},{"sl":57}]},"test_4624":{"methods":[{"sl":30}],"name":"test_for_issue2","pass":true,"statements":[{"sl":31},{"sl":33},{"sl":34},{"sl":36},{"sl":37}]},"test_4723":{"methods":[{"sl":40}],"name":"test_for_issue3","pass":true,"statements":[{"sl":41},{"sl":43},{"sl":44},{"sl":46},{"sl":47}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1568], [1568], [], [1568], [1568], [], [1568], [1568], [], [], [4624], [4624], [], [4624], [4624], [], [4624], [4624], [], [], [4723], [4723], [], [4723], [4723], [], [4723], [4723], [], [], [333], [333], [], [333], [333], [], [333], [333], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
