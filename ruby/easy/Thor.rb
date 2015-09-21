STDOUT.sync = true # DO NOT REMOVE
# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.
# ---
# Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.

# light_x: the X position of the light of power
# light_y: the Y position of the light of power
# initial_tx: Thor's starting X position
# initial_ty: Thor's starting Y position
@light_x, @light_y, @initial_tx, @initial_ty = gets.split(" ").collect {|x| x.to_i}

# game loop
loop do
    remaining_turns = gets.to_i
    direction = ""

    if (@light_y < @initial_ty )
        direction = "N"
        @initial_ty -= 1
    elsif (@light_y > @initial_ty )
        direction = "S"
        @initial_ty +=1
    else
        STDERR.puts "on correct Y"
    end

    if (@light_x < @initial_tx)
        direction = direction + "W"
        @initial_tx += 1
    elsif (@light_x > @initial_tx)
        direction = direction + "E"
        @initial_tx -= 1
    else
        STDERR.puts "on correct X"
    end
    puts direction
end
