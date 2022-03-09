import plotly.graph_objects as go

# data
label = ["Translated - 605",
    "Compiled - 521",
    "Did Not Compile - 84",
    "Full Run - 516",
    "Time Out - 5",
    "No Exception - 203",
    "Exception - 313",
    "Full Match of Outputs - 151",
    "Different Outputs - 52"]
source = [0,    0,  1,      1,  3,      3,      5,      5]
target = [1,    2,  3,      4,  5,      6,      7,      8]
value =  [521,  84, 516,    5,  203,    313,    151,    52]
# data to dict, dict to sankey
link = dict(source = source, target = target, value = value)
node = dict(label = label, pad=100, thickness=10,
    x=[0, 0.25, 0.25, 0.5, 0.5,   0.75, 0.75,    1, 1],
    y=[0, 0,    0.8,  0,   0.7,   0,    0.6,     0, 0.5])
layout =  dict(
    title = "j2py Translation Results",
    height = 772,
    width = 1080,
    font = dict(
      size = 14
    ),    
)
data = go.Sankey(link = link, node=node)
# plot
fig = go.Figure(data)
fig.update_layout(layout)
fig.show()
# fig.write_image("fig1.png")
