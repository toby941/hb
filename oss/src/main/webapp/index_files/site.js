jQuery(function(){
	jQuery('#weixinzone>div').hover(function(){
		jQuery('div',this).show();
	},function(){
		jQuery('div',this).hide();
	});	
	jQuery('#clients>div').hover(function(){
		jQuery('>img',this).show();
	},function(){
		jQuery('>img',this).hide();
	});
});
var nd=new Date();
var nt=(nd.getYear()+1900)+"-"+(nd.getMonth()+1)+"-"+nd.getDate()+" "+nd.getHours()+":"+nd.getMinutes()+":"+nd.getSeconds();
var dtna=0;
var dtnc=0;
function desktopnotify(){
	jQuery('#desktopnotifyrequest').hide();
	if(window.webkitNotifications){
		if(window.webkitNotifications.checkPermission()==0){
			setInterval(notifyquery,100000);
		}else{
			jQuery('#desktopnotifyrequest').show();
			var dtnb=parseInt(jQuery.cookie('dtnb'));
			if(isNaN(dtnb))dtnb=0;
			if(dtnb<5){
				dtnb++;
				jQuery.cookie('dtnb',dtnb,{expires:3,path:'/'});
				dtna=setInterval(function(){
					jQuery('#desktopnotifyrequest a').css('color',dtnc%2==0?'#f26428':'#fff');
					dtnc++;
					if(dtnc==10) clearInterval(dtna);
				},500);
			}
		}
	}
}
function notifyrequest(){
	window.webkitNotifications.requestPermission(desktopnotify);
}
function notifyquery(){
	jQuery.ajax({
		url:'/notify.php',
		data:{t:nt},
		cache:false,
		success:function(data){
			nt=data['now'];
			for(var key in data['posts']){
				var o = data['posts'][key];
				var u = o['url'];
				var n = window.webkitNotifications.createNotification(
						'http://www.leiphone.com/wp-content/themes/leiphone/images/samples/category_icon.png',
						'雷锋网',
						o['title']);
				n.onclick=function(){
					window.open(u);
					n.cancel();
				};
				n.replaceId=o['id'];
				n.show();
				setTimeout(function(){n.cancel();}, 10000);
			}
		}
	});
}
function setlastvisit(){
	var lastvisit=new Date(jQuery.cookie('lastvisit'));
	if(lastvisit<new Date(new Date()-86400000))lastvisit=new Date(new Date()-86400000);
	jQuery.cookie('lastvisit',new Date(),{expires:10,path:'/'});
	jQuery('[data-posttime]').each(function(){
		var x=jQuery(this);
		var pt=new Date(x.attr('data-posttime'));
		if(pt>lastvisit){
			x.addClass('newpost');
			jQuery('a',x).click(function(){x.removeClass('newpost');});
		}
	});
}
